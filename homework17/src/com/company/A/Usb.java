package com.company.A;

public class Usb {
    private double typePort;
    private String idPort;

    public Usb () {}

    public Usb(double typePort, String idPort) {
        this.typePort = typePort;
        this.idPort = idPort;
    }

    public double getTypePort() {
        return typePort;
    }

    public void setTypePort(double typePort) {
        this.typePort = typePort;
    }

    public String getIdPort() {
        return idPort;
    }

    public void setIdPort(String idPort) {
        this.idPort = idPort;
    }

    @Override
    public String toString() {
        return String.format("port type (%s), id (%s)", this.typePort, this.idPort);
    }
}
