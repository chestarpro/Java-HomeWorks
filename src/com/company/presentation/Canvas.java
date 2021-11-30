package com.company.presentation;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Canvas extends JPanel {
    private final Model model;
    private Image image;

    public Canvas(Model model) {
        this.model = model;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        try {
            image = ImageIO.read(model.getCurrentFile());
            image = image.getScaledInstance(1250, 750, Image.SCALE_FAST);
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(image, 130, 20, null);
    }
}