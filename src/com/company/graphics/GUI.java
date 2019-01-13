package com.company.graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GUI extends JFrame {
    JFrame frame;
    private JButton button_1 = new JButton("Start Game");
    private JButton button_2 = new JButton("Setting");
    private JButton button_3 = new JButton("Exit");
    private JPanel main_panel = new JPanel();


    public void TestGUI() {

        CREATE_MAIN_GUI();
    }


    public void CREATE_MAIN_GUI()  {
        frame = new JFrame();
        frame.setLayout(new GridBagLayout());


        frame.setLocationRelativeTo(null);

        frame.setBounds(100, 100, 250, 100);
        setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(new BgPanel());
        Container m_con = frame.getContentPane();
        m_con.setLayout(new FlowLayout());

        m_con.add(button_1);
        m_con.add(button_2);
        m_con.add(button_3);

        frame.setTitle("LitRPG");
        frame.setSize(700, 600);
        frame.setVisible(true);


        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button_3.setText("You Pidor");
            }
        });
    }
}
