package Tutorials.F16_12_2022;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("10 Buttons");
        frame.setBounds(200, 200, 400, 200);
        Scanner scan = new Scanner(System.in);

        Random rnd = new Random();
        int n=10;
        for (int i=0; i<n; i++) {
            if (i<n/2) {
                JButton b = new JButton();
                char letter = (char) (rnd.nextInt(25)+'A');
                b.setText(String.valueOf(letter));
                b.addActionListener(e-> {
                    b.setBackground(Color.red);
                    b.setForeground(Color.WHITE);
                });
                frame.add(b);
            }
            else {
                JButton b = new JButton(rnd.nextInt(10)+"");
                b.addActionListener(e-> {
                    b.setBackground(Color.blue);
                    b.setForeground(Color.WHITE);
                    b.setSize(50, 50);
                    b.setText("HELLO");
                });
                frame.add(b);
            }
        }


        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}
