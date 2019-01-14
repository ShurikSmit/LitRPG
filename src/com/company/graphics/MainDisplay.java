package com.company.graphics;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;


class BgPanel extends JPanel  implements ActionListener{

    JFrame frame;

    Timer timer = new Timer(20, this);

    public BgPanel(JFrame frame){
        this.frame = frame;
    }
    public void paintComponent(Graphics g)
    {
        BufferedImage im = null;
        try {
            im = ImageIO.read(new File("src\\com\\company\\graphics\\image\\bgimage.jpg"));
        } catch (IOException e) {}
        g.drawImage(im, 0, 0,frame.getWidth(),frame.getHeight(), null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        repaint();
    }
}