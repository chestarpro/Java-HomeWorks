package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class RealImageServiceImpl implements ImageService {

    private final String fileName;
    private Image image;

    public RealImageServiceImpl(String fileName) {
        this.fileName = fileName;
        load();
    }

    public void load() {
        System.out.println("Загрузка " + fileName);
        try {
            image = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Просмотр " + fileName);
        JFrame frame = new JFrame("Proxy");
        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.drawImage(image, 50, 50, null);
            }
        };

        frame.setSize(1030, 500);
        frame.setResizable(false);
        frame.add("Center", panel);
        frame.setLocation(500, 50);
        frame.setVisible(true);
    }
}