package com.company;

public class ProxyApp {

    public static void main(String[] args) {
        ImageService imageService = new ProxyImageServiceImpl("Proxy-images/proxy.png");
        imageService.display();
    }
}