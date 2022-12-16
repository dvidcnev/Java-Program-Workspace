package Tutorials.F16_12_2022;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task5 {
    static int counter;
    static JLabel label = new JLabel("The value of the counter is " + counter);
    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter frame");
        frame.setBounds(200, 200, 400, 200);

        JPanel panel = new JPanel();
        JButton b = new JButton("+");
        JButton b1 = new JButton("-");

        //increase
        b.addActionListener( e -> {
            counter++;
            label.setText("The value of the counter is " + counter);
        });
        //decrease
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counter--;
                label.setText("The value of the counter is " + counter);
            }
        });

        //adding the panels
        panel.add(label);
        panel.add(b);
        panel.add(b1);

        //finishing up frame
        frame.add(panel);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}
