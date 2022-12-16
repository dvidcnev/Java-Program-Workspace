package Tutorials.F16_12_2022;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class MainTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First frame in JAVA B)");
//    frame.setLocation(200, 400);
//    frame.setSize(500, 300);
        frame.setBounds(200, 400, 500, 300); //instead of setting location and size

        Button b = new Button("First button in frame");
        frame.add(b, BorderLayout.NORTH);
        JButton b1 = new JButton("THIS IS BUTTON");
        frame.add(b1, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //should give more options, but you know INTELLIJ
    }
}
