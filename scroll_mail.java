package java24hours.Applet;

import java.awt.*;
import javax.swing.*;

/**
 * Created by Satrajit on 2016-04-22.
 */
class scroll_mail extends JFrame{

    public scroll_mail(){
        super("Compose E-mail");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);

        JPanel first = new JPanel();
        JLabel to = new JLabel("To: ");
        first.add(to);
        JTextField too = new JTextField("Enter recipient email", 30);
        first.add(too);
        add(first);

        JPanel second = new JPanel();
        JLabel sub = new JLabel("Subject ");
        second.add(sub);
        JTextField subt = new JTextField("Enter subject", 30);
        second.add(subt);
        add(second);

        JPanel third = new JPanel();
        JLabel msg = new JLabel("Enter message ");
        third.add(msg);
        JTextArea message = new JTextArea(4, 30);
        message.setLineWrap(true);
        message.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(message,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        third.add(scroll);
        add(third);

        JPanel fourth = new JPanel();
        JButton send = new JButton("Send");
        fourth.add(send);
        add(fourth);

        setVisible(true);
    }

    public static void main(String[] args) {
        scroll_mail run = new scroll_mail();
    }
}
