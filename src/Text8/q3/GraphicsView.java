package Text8.q3;

import java.util.Observer;
import java.util.Observable;
import java.awt.Graphics;
import java.awt.Canvas;
/**
 *
 * <p>Title: The View part of Application </p>
 * <p>Description: A class can implement the Observer interface when it wants to
 *  be informed of changes in observable objects. </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * @author Smart Lee
 * @version 1.1
 */
public class GraphicsView extends Canvas implements Observer {
    // 定义鼠标坐标
    int x, y;
    // 定义球半径
    double radius;
    // 控制点坐标是否显示
    boolean bShowDim;
    //实现接口的方法
    public void update(Observable o, Object arg) {
        Sphere balloon = (Sphere) o;
        radius = balloon.getRadius();
    }
    // 绘球体
    public void paint(Graphics g) {
        int d = (int) radius * 2;
        int X = this.getWidth();
        int Y = this.getHeight(); // 注意不能在全局变量里设值！
        g.drawOval( (X - d) / 2, (Y - d) / 2, d, d);
        g.drawOval( (X - d) / 2, Y / 2 - d / 8, d, d / 4);
        g.drawOval(X / 2 - d / 8, (Y - d) / 2, d / 4, d);
        // 显示鼠标坐标
        if(bShowDim) {
            g.drawString("(" + x + ", " + y + ")", x, y);
        }
    }
}
