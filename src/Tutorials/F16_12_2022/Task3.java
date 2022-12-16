package Tutorials.F16_12_2022;

import javax.swing.*;

public class Task3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("OK Frame");
        frame.setBounds(200, 200, 200, 200);

        JPanel panel = new JPanel();
        JButton b = new JButton("OK");
        JLabel label = new JLabel("insert your name");
        JTextField tf = new JTextField("WRITE HERE");
        JCheckBox cb = new JCheckBox("Student");
        JRadioButton rb = new JRadioButton("Employer");
        JComboBox comboBox = new JComboBox(new String[] { "1st", "2nd", "3rd"});
        panel.add(b);
        panel.add(label);
        panel.add(tf);
        panel.add(cb);
        panel.add(rb);
        panel.add(comboBox);

        frame.add(panel);
        frame.pack(); //put them in one line!
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}
