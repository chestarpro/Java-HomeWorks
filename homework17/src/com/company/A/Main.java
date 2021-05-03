package com.company.A;

public class Main {

    public static void main(String[] args) {
        Display display = new Display(32, "Samsung", "IPS");
        HardDisk hardDisk = new HardDisk(1, 2);
        Keyboard keyboard = new Keyboard(new String[]{"qwerty"}, true, true);
        Ram ram = new Ram(16, "Kingston HyperX");
        Usb usb = new Usb(3.0, "USB\\ROOT_HUB30&VID8086&PID8CB1&REV0000");
        Usb[] arrayUsb = new Usb[1];
        arrayUsb[0] = usb;

        Computer computer = new Computer (display, "Asus", "Black", hardDisk, ram,
                                "NVIDIA GeForce GTX 960  (4 GB)", arrayUsb, keyboard);

        System.out.println("------------------------------\n" +
                "Characteristics of my computer" +
                "\n------------------------------\n" + computer);
    }
}
