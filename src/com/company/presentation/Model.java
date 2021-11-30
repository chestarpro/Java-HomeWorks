package com.company.presentation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private final List<File> presentationList;
    private final Viewer viewer;
    private int index;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        presentationList = new ArrayList<>();
        index = 0;
    }

    public void doAction(String command) {
        if (command.equals("Next")) {
            index++;
            if (index == presentationList.size())
                index = 0;
        } else if (command.equals("Previous")) {
            index--;
            if (index == -1)
                index = presentationList.size() - 1;
        }
        viewer.update();
    }

    public void initPresentationList() {
        presentationList.add(new File("Proxy-images/1.jpg"));
        presentationList.add(new File("Proxy-images/2.jpg"));
        presentationList.add(new File("Proxy-images/3.jpg"));
        presentationList.add(new File("Proxy-images/4.jpg"));
        presentationList.add(new File("Proxy-images/5.jpg"));
        presentationList.add(new File("Proxy-images/6.jpg"));
        presentationList.add(new File("Proxy-images/7.jpg"));
        presentationList.add(new File("Proxy-images/8.jpg"));
        presentationList.add(new File("Proxy-images/9.jpg"));
        presentationList.add(new File("Proxy-images/10.jpg"));
    }

    public File getCurrentFile() {
        return presentationList.get(index);
    }
}