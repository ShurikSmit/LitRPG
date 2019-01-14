package com.company.graphics;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.border.*;

public class GUI extends JFrame {
    public void TestGUI() {
        CREATE_MAIN_GUI();
    }
    public void CREATE_MAIN_GUI()  {
        JButton button_start = new JButton("Start");
        JButton button_setting = new JButton("Setting");
        JButton button_exit = new JButton("Exit");
        JFrame frame_m = new JFrame();
        JPanel main_panel = new JPanel();


        //настройки разрешения и видимости
        frame_m.setTitle("LitRPG");
        frame_m.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame_m.setVisible(true);
        frame_m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame_m.setContentPane(new BgPanel(frame_m)); // картинка

        JPanel buttonPanel = new JPanel( new GridLayout(3, 1, 0, 0) );

        buttonPanel.setBorder( new EmptyBorder(240, 233, 0, 0) );
        //buttonPanel.setOpaque( false );

        button_start.setPreferredSize(new Dimension(160,45));
        button_setting.setPreferredSize(new Dimension(160,45));
        button_exit.setPreferredSize(new Dimension(160,45));


        buttonPanel.add(button_start);
        buttonPanel.add(button_setting);
        buttonPanel.add(button_exit);

        frame_m.add(buttonPanel);

        frame_m.repaint();


    }
}