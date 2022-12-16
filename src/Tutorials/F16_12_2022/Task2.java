package Tutorials.F16_12_2022;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First frame in JAVA B)");
        JPanel panel = createpanelNxN(5);
        frame.setBounds(200, 400, 500, 300); //instead of setting location and size
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static JPanel createpanelNxN(int n) {
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(n, n);
        panel.setLayout(gl);
        Random rand = new Random();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                JButton b = new JButton(""+rand.nextInt(10));
//                b.setText(String.valueOf(rand.nextInt(10)));
                b.setBackground(new Color(5+i, 200-j*30, 255-i*50));
                b.setForeground(Color.RED);
                panel.add(b);
            }
        }
        return panel;
    }
}
