package com.company;

public class ProxyImageServiceImpl implements ImageService {

    private final String fileName;
    private RealImageServiceImpl image;

    public ProxyImageServiceImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImageServiceImpl(fileName);
        }
        image.display();
    }
}