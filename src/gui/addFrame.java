package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addFrame extends JFrame implements ActionListener {
    private JLabel labe1;
    private JLabel labe2;
    private JLabel labe3;
    private JLabel labe4;
    private JLabel labe5;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JTextField txt4;
    private JTextField txt5;
    private JButton btn1;
    private JButton btn2;
    public addFrame() {
        labe1 = new JLabel("学号");
        labe2 = new JLabel("姓名");
        labe3 = new JLabel("年龄");
        labe4 = new JLabel("性别");
        labe5 = new JLabel("住址");
        txt1 = new JTextField("12345", 10);
        txt2 = new JTextField(10);
        txt3 = new JTextField(10);
        txt4 = new JTextField(10);
        txt5 = new JTextField(10);
        btn1 = new JButton("确定添加");
        btn1.addActionListener(this);
        btn2 = new JButton("取消添加");
        btn2.addActionListener(this);
        this.setSize(600,900);
        this.setVisible(true);
        this.setLayout(new GridLayout(6,2));
        this.add(labe1);
        this.add(txt1);
        this.add(labe2);
        this.add(txt2);
        this.add(labe3);
        this.add(txt3);
        this.add(labe4);
        this.add(txt4);
        this.add(labe5);
        this.add(txt5);
        this.add(btn1);
        this.add(btn2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {

        }
        if (e.getSource() == btn2) {
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");

        }
    }
}
