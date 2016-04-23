package java24hours.Applet;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Satrajit on 2016-04-21.
 */
public class app_1 extends JFrame {
    public app_1(){
        setTitle("Hello world");
        setSize(30, 100);
        //pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        JButton open = new JButton("Open");
        JButton close = new JButton("Close");
        add(open);
        add(close);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        app_1 hi = new app_1();
    }
}
