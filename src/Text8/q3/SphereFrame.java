package Text8.q3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * <p>Title: SphereFrame</p>
 * <p>Description: configure the basic info of JFrame</p>
 * <p>Copyright: Copyright (c) 2005</p>
 * @author Smart Lee
 * @version 1.1
 */
public class SphereFrame extends JFrame {
    boolean packFrame = false;
    JPanel contentPane;
    GridLayout borderLayout1 = new GridLayout(1, 2);
    //Construct the frame
    public SphereFrame() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        try {
            jbInit();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    //Component initialization
    private void jbInit() throws Exception  {
        //Validate frames that have preset sizes
        //Pack frames that have useful preferred size info, e.g. from their layout
        if (packFrame) {
            this.pack();
        }
        else {
            this.validate();
        }
        //Center the window
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        this.setSize(600,300);
        // 使窗口居中
        this.setLocationRelativeTo(null);
        contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(borderLayout1);
        this.getContentPane().setBackground(SystemColor.controlLtHighlight);
        this.setTitle("Spheres: volume and surface area");
    }
    //Overridden so we can exit when window is closed
    protected void processWindowEvent(WindowEvent e) {
        super.processWindowEvent(e);
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            System.exit(0);
        }
    }
}
