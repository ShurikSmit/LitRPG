package com.company.graphics;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

class BgPanel extends JPanel implements ActionListener{

    JFrame frame;

    Timer timer = new Timer(20, this);

    public BgPanel(JFrame frame){
        this.frame = frame;
    }
    public void paintComponent(Graphics g)
    {
        Image im = null;
        try {
            im = ImageIO.read(new File("O:\\Java\\LitRPG\\src\\com\\company\\graphics\\image\\main_image.jpg"));
        } catch (IOException e) {}
        g.drawImage(im, 0, 0,frame.getWidth(),frame.getHeight(), null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        repaint();
    }
}