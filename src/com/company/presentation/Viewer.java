package com.company.presentation;

import javax.swing.*;
import java.awt.*;

public class Viewer {
    private final Canvas canvas;
    private JButton next, previous;
    private JFrame frame;

    public Viewer() {
        Controller controller = new Controller(this);
        Model model = controller.getModel();
        model.initPresentationList();
        canvas = new Canvas(model);
        initButton(controller);
        initFrame();
        frame.setVisible(true);
    }

    public void update() {
        canvas.repaint();
    }

    private void initFrame() {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

        int width = (int) ((double) gd.getDisplayMode().getWidth() * 0.80);
        int height = (int) ((double) gd.getDisplayMode().getHeight() * 0.90);

        width = width - (width % 10);
        height = height - (height % 10);

        frame = new JFrame("Presentation Proxy Pattern");

        frame.setSize(width, height);
        frame.setLocation(200, 20);
        frame.add(initMenuPanel(), BorderLayout.EAST);
        frame.add(canvas, BorderLayout.CENTER);
    }

    private JPanel initMenuPanel() {
        JPanel panel = new JPanel();
        JToolBar toolBar = new JToolBar();
        toolBar.setBackground(Color.DARK_GRAY);
        toolBar.add(previous);
        toolBar.add(next);
        panel.add(toolBar);
        return panel;
    }

    private void initButton(Controller controller) {
        previous = createButton(createIcon("Proxy-images/previous.png"), "Previous", controller);
        next = createButton(createIcon("Proxy-images/next.png"), "Next", controller);
    }

    private JButton createButton(Icon icon, String command, Controller controller) {
        JButton button = new JButton(icon);
        button.setActionCommand(command);
        button.addActionListener(controller);
        return button;
    }

    private Icon createIcon(String url) {
        return new ImageIcon(url);
    }
}