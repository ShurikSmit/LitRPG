package com.company;
import javax.swing.*;
import java.awt.event.*;


public class GUI extends JFrame {
    private JFrame frame = new JFrame();
    private JButton button_1 = new JButton("Start Game");
    private JButton button_2 = new JButton("Setting");
    private JButton button_3 = new JButton("Exit");

    public void TestGUI() {
        CREATE_MAIN_GUI();
    }

    public void CREATE_MAIN_GUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button_1);
        frame.getContentPane().add(button_2);
        frame.getContentPane().add(button_3);

        frame.setSize(300, 300);
        frame.setVisible(true);
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button_3.setText("You Pidor");
            }
        });
    }
}