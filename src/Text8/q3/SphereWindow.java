package Text8.q3;

import javax.swing.*;
import java.awt.event.*;
/**
 * <p>Title: SphereWindow</p>
 * <p>Description: The Controller part of the model-view paradigm</p>
 * <p>Copyright: Copyright (c) 2005</p>
 * @author Smart Lee
 * @version 1.1
 */
public class SphereWindow extends SphereFrame implements
        ActionListener, MouseListener, MouseMotionListener{
    // 创建视图一
    TextView tView = new TextView();
    // 创建视图二
    GraphicsView gView = new GraphicsView();
    // 创建模型
    Sphere model = new Sphere();
    //Construct the application
    public SphereWindow() {
        try {
            jbInit();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    //Main method
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        new SphereWindow();
    }
    private void jbInit() throws Exception {
        // 添加视图
        contentPane.add(tView);
        contentPane.add(gView);
        this.setVisible(true);
        // 建立模型与视图一的关联
        model.addObserver(tView);
        tView.update(model, null);
        // 建立模型与视图二的关联
        model.addObserver(gView);
        gView.update(model, null);
        // 为视图一各控件添加事件监听器
        tView.radiusTextField.addActionListener(this);
        tView.volumeTextField.addActionListener(this);
        tView.surfAreaTextField.addActionListener(this);
        // 为视图二添加鼠标事件
        gView.addMouseListener(this);
        gView.addMouseMotionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tView.radiusTextField) {
            JTextField jtf = (JTextField)e.getSource();
            // 捕获异常字符
            try {
                double radius = Double.parseDouble(jtf.getText());
                // 更改模型数据
                model.setRadius(radius);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"illegal character!");
            }
            // 调用视图二的绘图方法以更新视图
            gView.repaint();
        }
        if (e.getSource() == tView.volumeTextField) {
            JTextField jtf = tView.volumeTextField;
            try {
                double volume = Double.parseDouble(jtf.getText());
                model.setVolume(volume);
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(null,"illegal character!");
            }
            gView.repaint();
        }
        if (e.getSource() == tView.surfAreaTextField) {
            JTextField jtf = (JTextField)e.getSource();
            try {
                double surfArea = Double.parseDouble(jtf.getText());
                model.setSuArea(surfArea);
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(null,"illegal character!");
            }
            gView.repaint();
        }
    }
    public void mousePressed(MouseEvent e) {
        int X = gView.getWidth() / 2;
        int Y = gView.getHeight() / 2;
        gView.bShowDim = true; // 控制是否显示点坐标
        gView.x = e.getX();
        gView.y = e.getY();
        // 圆心坐标(X, Y)
        gView.radius = pointDistance(gView.x, gView.y, X, Y);
        // 更改数据模型
        model.setRadius(gView.radius);
        gView.repaint();
    }
    public void mouseReleased(MouseEvent e) {
        // 鼠标离开时不再显示点坐标
        gView.bShowDim = false;
        gView.repaint();
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
    public void mouseClicked(MouseEvent e) {
    }
    public void mouseMoved(MouseEvent e) {
    }
    public void mouseDragged(MouseEvent e) {
        int X = gView.getWidth() / 2;
        int Y = gView.getHeight() / 2;
        gView.bShowDim = true;
        gView.x = e.getX();
        gView.y = e.getY();
        gView.radius = pointDistance(gView.x, gView.y, X, Y);
        model.setRadius(gView.radius);
        gView.repaint();
    }
    /**
     * 求两点距离
     * @param x1 double 点1的横坐标
     * @param y1 double 点1的纵坐标
     * @param x2 double 点2的横坐标
     * @param y2 double 点2的纵坐标
     * @return double
     */
    protected double pointDistance(double x1, double y1, double x2, double y2) {
        return Math.pow(((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)), 1/2.0);
    }
}
