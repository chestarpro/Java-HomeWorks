package com.company.A;

import java.util.Arrays;

public class Computer {
    private Display display;
    private String model;
    private String color;
    private HardDisk hardDisk;
    private Ram ram;
    private String videoCard;
    private Usb[] usb;
    private Keyboard keyboard;

    public Computer () {}

    public Computer(Display display, String model, String color, HardDisk hardDisk, Ram ram, String videoCard, Usb[] usb, Keyboard keyboard) {
        this.display = display;
        this.model = model;
        this.color = color;
        this.hardDisk = hardDisk;
        this.ram = ram;
        this.videoCard = videoCard;
        this.usb = usb;
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Keyboard getKeyboards() {
        return keyboard;
    }

    public void setKeyboards(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Usb[] getUsb() {
        return usb;
    }

    public void setUsb(Usb[] usb) {
        this.usb = usb;
    }

    @Override
    public String toString() {
        String strUsb = Arrays.toString(this.usb);
        return String.format("""
                        Display: %s\s
                        Model: %s\s
                        Color: %s\s
                        Hard disk(SSD): %s\s
                        RAM: %s\s
                        Video card: %s\s
                        USB: %s\s
                        Keyboard: %s""",
                this.display, this.model, this.color,
                this.hardDisk, this.ram, this.videoCard,
                strUsb.substring(1, strUsb.length() -1), this.keyboard);
    }

}
