package F.I.N.A.L.web;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class AppleBrowner extends Applet {
    public void init() {
        this.addMouseListener(new MouseAdpt(this));
    }
    public void paint(Graphics g) {
        g.drawString("点击此区域转向新浪主页", 10, 20);
    }
}
    class MouseAdpt extends MouseAdapter {
        Applet m_Parent;
        MouseAdpt(Applet p) {
            m_Parent = p;
        }
        public void mouseClicked(MouseEvent evt) {
            try {
                URL myURL = new URL("https://www.sina.com.cn");
                m_Parent.getAppletContext().showDocument(myURL);
            } catch (MalformedURLException e) {
                System.out.println("URL in wrong form, check it again.");
            }
        }
    }