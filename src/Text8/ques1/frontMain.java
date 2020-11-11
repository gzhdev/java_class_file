package Text8.ques1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frontMain extends JFrame implements ActionListener {
    // GUI
    private JPanel p1 = new JPanel();
    JTextArea ja = new JTextArea(8,50);
    String[] name = {"+", "-", "*", "/", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "=", "C"};
    StringBuffer bs = new StringBuffer();
    // core
    double[] nums = new double[10];
    double result = 0;
    String symbol = new String();
    int point = 0;

    public frontMain() {
    setTitle("计算器");
    setBounds(800,300,1000,600);
    // 显示框
    this.add(ja, BorderLayout.NORTH);
    ja.setEditable(false);
    // 计算按钮
    p1.setLayout(new GridLayout(4,5,0,0));
    JButton[] but = new JButton[name.length];
    for (int i = 0; i < name.length; i++) {
        but[i] = new JButton(name[i]);
        }
    for (JButton b:but) {
        b.addActionListener(this);
        p1.add(b);
        }
    this.add(p1);

    this.setVisible(true);

    }

    public double toDouble(double[] n) {
        double  sum = 0;
        for (int i=0;i<point;i++){
            sum += n[i]*Math.pow(10,point-1-i);
        }
        return sum;
    }

    public void core(){
        if(symbol == "pl"){
            System.out.println("启动加运算");
            symbols();
        }else if(symbol == "mi"){
            System.out.println("启动减运算");
            result -= toDouble(nums);
            nums = new double[100];
            point = 0;
        }else if(symbol == "mu") {
            System.out.println("启动乘运算");
            result = result * toDouble(nums);
            nums = new double[100];
            point = 0;
        }else if(symbol == "de" ) {
            System.out.println("启动除运算");
            result = result / toDouble(nums);
            nums = new double[100];
            point = 0;
        }
    }

    public void symbols(){
        result += toDouble(nums);
        nums = new double[100];
        point = 0;
    }

    public void input(String s) {
        System.out.println("启动输入函数");
        switch (s){
            case "+":
                System.out.println("开始执行加操作");
                symbols();
                System.out.println("数组清空加入结果");
                symbol = "pl";
                break;
            case "-":
                System.out.println("开始执行减操作");
                symbols();
                System.out.println("数组清空加入结果");
                symbol = "mi";
                break;
            case "*":
                System.out.println("开始执行乘操作");
                symbols();
                System.out.println("数组清空加入结果");
                symbol = "mu";
                break;
            case "/":
                System.out.println("开始执行除操作");
                symbols();
                System.out.println("数组清空加入结果");
                symbol = "de";
                break;
            case "=":
                System.out.println("开始执行等于操作");
                core();
                System.out.println("启动运算方法");
                bs = new StringBuffer();
                bs.append(result);
                System.out.println("文本框更新");
                ja.setText(String.valueOf(bs));
                System.out.println("输出结果");
                break;
            case "C":
                System.out.println("开始执行清除操作");
                nums = new double[10];
                point = 0;
                System.out.println("数组清空");
                bs=new StringBuffer();
                ja.setText("");
                System.out.println("文本框清空");
                result = 0;
                System.out.println("结果变量清空");
                symbol = "";
                System.out.println("运算符号清空");
                break ;
            default:
                System.out.println("接受数"+s);
                nums[point] = Double.parseDouble(s);
                System.out.println("数"+s+"进入数组");
                point++;
                System.out.println("数组指针+1");
        }
        System.out.println("此时结果变量为"+result);
        System.out.println("此时数组指针为"+point);
    }

    public void actionPerformed(ActionEvent e) {
        String key = e.getActionCommand();
        bs.append(key);
        ja.setText(String.valueOf(bs));
        System.out.println("输出文本");
        input(key);
    }
}
