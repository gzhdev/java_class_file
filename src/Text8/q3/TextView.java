package Text8.q3;


import java.util.Observer;
import java.util.Observable;
import java.text.NumberFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * <p>Title: The View part of Application </p>
 * <p>Description: A class can implement the Observer interface when it wants to
 *  be informed of changes in observable objects. </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * @author Smart Lee
 * @version 1.1
 */
public class TextView extends JPanel implements Observer {
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    private boolean textBlankFlag = true;
    JLabel radiusLab = new JLabel();
    JLabel volumeLab = new JLabel();
    JLabel suAreaLab = new JLabel();
    JTextField radiusTextField = new JTextField();
    JTextField volumeTextField = new JTextField();
    JTextField surfAreaTextField = new JTextField();
    public TextView() {
        try {
            jbInit();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    //实现接口的方法
    public void update (Observable o, Object arg) {
        NumberFormat nf = NumberFormat.getInstance();
        Sphere balloon = (Sphere) o;
        if(textBlankFlag) {
            radiusTextField.setText("");
            volumeTextField.setText("");
            surfAreaTextField.setText("");
            textBlankFlag = false;
        }
        else {
            radiusTextField.setText(nf.format(balloon.getRadius()));
            volumeTextField.setText(nf.format(balloon.getVolume()));
            surfAreaTextField.setText(nf.format(balloon.getSuArea()));
        }
    }
    private void jbInit() throws Exception {
        radiusLab.setFont(new java.awt.Font("Dialog", 0, 14));
        radiusLab.setText("  Radius =");
        this.setBackground(Color.lightGray);
        this.setForeground(Color.black);
        this.setLayout(gridBagLayout1);
        volumeLab.setFont(new java.awt.Font("Dialog", 0, 14));
        volumeLab.setText("  Volume =");
        suAreaLab.setFont(new java.awt.Font("Dialog", 0, 14));
        suAreaLab.setText("  Surface area =");
        radiusTextField.setFont(new java.awt.Font("Dialog", 0, 14));
        radiusTextField.setText("");
        volumeTextField.setFont(new java.awt.Font("Dialog", 0, 14));
        volumeTextField.setText("");
        surfAreaTextField.setFont(new java.awt.Font("Dialog", 0, 14));
        surfAreaTextField.addActionListener(new TextView_surfAreaTextField_actionAdapter(this));
        this.add(radiusLab,     new GridBagConstraints(0, 0, 1, 2, 0.0, 0.0
                ,GridBagConstraints.NORTH, GridBagConstraints.NONE, new Insets(-1, 0, 0, 0), 86, 10));
        this.add(volumeLab,   new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0
                ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        this.add(suAreaLab,   new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0
                ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        this.add(radiusTextField,  new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0
                ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, -19, 0, 19), 147, 1));
        this.add(volumeTextField, new GridBagConstraints(1, 1, 1, 2, 0.0, 0.0
                ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, -19, 0, 19), 147, 3));
        this.add(surfAreaTextField, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0
                ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, -19, 0, 19), 147, 4));
    }
    void surfAreaTextField_actionPerformed(ActionEvent e) {
    }
}
class TextView_surfAreaTextField_actionAdapter implements java.awt.event.ActionListener {
    TextView adaptee;
    TextView_surfAreaTextField_actionAdapter(TextView adaptee) {
        this.adaptee = adaptee;
    }
    public void actionPerformed(ActionEvent e) {
        adaptee.surfAreaTextField_actionPerformed(e);
    }
}
