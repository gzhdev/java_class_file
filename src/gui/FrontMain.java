package gui;

import java.awt.*;

public class FrontMain extends Frame {
    // 五个标签
    private Label label1;
    private Label label2;
    private Label label3;
    private Label label4;
    private Label label5;
    // 五个文本框
    private TextField textField1;
    private TextField textField2;
    private TextField textField3;
    private TextField textField4;
    private TextField textField5;
    // 按钮
    private Button btn1;
    private Button btn2;
    public FrontMain(){
        label1 = new Label("学号");
        label2 = new Label("姓名");
        textField1 = new TextField(10);
        textField2 = new TextField(10);
        btn1 = new Button("确定添加");
        btn2 = new Button("取消");


    }
}
