package java24hours.Applet;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Satrajit on 2016-04-22.
 */

class KeyViewer extends JFrame implements KeyListener {
    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press any key in the text field.");

    KeyViewer() {
        super("KeyViewer"); //to name the applet title
        setSize(350, 100); //to set the size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //to define how it closes
        keyText.addKeyListener(this);
        BorderLayout bord = new BorderLayout();               //setting layout
        setLayout(bord);                                      //setting layout
        add(keyLabel, BorderLayout.NORTH);                    //layout positioning
        add(keyText, BorderLayout.CENTER);                    //layout positioning
        setVisible(true);                                     //visibility
    }

    public void keyTyped(KeyEvent input) {
        char key = input.getKeyChar();
        keyLabel.setText("You pressed " + key);
    }

    public void keyPressed(KeyEvent txt) {
        // do nothing
    }

    public void keyReleased(KeyEvent txt) {
        // do nothing
    }

    public static void main(String[] arguments) {
        KeyViewer frame = new KeyViewer();
    }
}