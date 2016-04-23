package java24hours.Applet;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by Satrajit on 2016-04-22.
 */
class my_app extends JFrame implements KeyListener{
    JLabel key = new JLabel("Enter any number:");
    JTextField number = new JTextField(3);
    BorderLayout bor = new BorderLayout();

    public my_app(){
        setTitle("Squaring a number");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        number.addKeyListener(this);
        setLayout(bor);
        add(key, BorderLayout.NORTH);
        add(number, BorderLayout.CENTER);
        setVisible(true);
    }
    public void keyTyped(KeyEvent in_num){
        char out_num = in_num.getKeyChar();
        if (out_num == 8 || out_num == 127)
            key.setText("You erased a character");
        else
            key.setText("Square of the last digit is " + (Math.pow(((int)out_num - 48), 2)));
    }
    public void keyPressed(KeyEvent txt){
    }
    public void keyReleased(KeyEvent txt){
    }
    public static void main(String[] args) {
        my_app hii = new my_app();
    }
}
