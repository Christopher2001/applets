package java24hours.Applet;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Satrajit on 2016-04-21.
 */
public class app_2 extends JFrame{
    BorderLayout flow = new BorderLayout();
    JLabel name_begin = new JLabel("Enter your name", JLabel.RIGHT);
    JButton a = new JButton("North");
    JButton b = new JButton("West");
    JButton c = new JButton("East");
    JButton d = new JButton("South");
    JTextField name_input = new JTextField("My Name", 30);
    JTextArea details = new JTextArea(30, 30);
    
    public app_2(){
        setTitle("Hello comp");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(flow);
        add(a, BorderLayout.NORTH);
        add(b, BorderLayout.WEST);
        add(c, BorderLayout.EAST);
        add(d, BorderLayout.SOUTH);
        add(name_begin);
        add(name_input);
        add(details);
        setVisible(true);
    }

    public static void main(String[] args) {
        app_2 aaa = new app_2();
    }
}
