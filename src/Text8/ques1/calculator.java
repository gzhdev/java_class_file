package Text8.ques1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener {
    JPanel p2 = new JPanel();
    JTextArea ja = new JTextArea(3,50);
    StringBuffer bs = new StringBuffer();
    StringBuffer tmp = new StringBuffer();
    double result = 0;
    String[] name = {"+", "-", "*", "/", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "=", "C"};
    private String  symbol;
    public calculator() {
        setTitle("计算器");
        p2.setLayout(new GridLayout(4,5,0,0));
        JButton[] but = new JButton[name.length];
        this.add(ja, BorderLayout.NORTH);
        for (int i = 0; i < name.length; i++) {
            but[i] = new JButton(name[i]);
        }
        for (JButton b:but) {
            b.addActionListener(this);
            p2.add(b);
        }
        this.add(p2);
        this.pack();
        this.setVisible(true);
    }
    public void calculate(String key) {
        bs.append(key);
        ja.setText(String.valueOf(bs));
        switch (key) {
            case "+":
                result += Double.parseDouble(String.valueOf(bs));
                tmp.delete(0,tmp.length()-1);
                symbol = "p";
            case "-":
                result += Double.parseDouble(String.valueOf(bs));
                tmp.delete(0,tmp.length()-1);
                symbol = "mi";
            case "*":
                result += Double.parseDouble(String.valueOf(bs));
                tmp.delete(0,tmp.length()-1);
                symbol = "mu";
            case "/":
                result += Double.parseDouble(String.valueOf(bs));
                tmp.delete(0,tmp.length()-1);
                symbol = "d";
            case "C":
                ja.setText("");
                bs.delete(0,bs.length()-1);
                tmp.delete(0,tmp.length()-1);
                result = 0;
            case "=":
                switch (symbol) {
                    case "p":
                        result += Double.parseDouble(String.valueOf(bs));
                    case "mi":
                        result -= Double.parseDouble(String.valueOf(bs));
                    case "mu":
                        result = result * Double.parseDouble(String.valueOf(bs));
                    case "d":
                        result = result / Double.parseDouble(String.valueOf(bs));
                        bs.append(result);
                }
            default:
                tmp.append(key);
        }

    }
    public void actionPerformed(ActionEvent e) {
        String key = e.getActionCommand();
        calculate(key);
    }

    public static void main(String[] args) {
        new calculator();
    }

}
