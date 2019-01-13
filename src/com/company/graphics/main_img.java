package com.company.graphics;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class BgPanel extends JPanel{
    public void paintComponent(Graphics g){
        Image im = null;
        try {
            im = ImageIO.read(new File("O:\\Java\\LitRPG\\src\\com\\company\\graphics\\image\\main_image.jpg"));
        } catch (IOException e) {}
        g.drawImage(im, 0, 0, null);
    }}
