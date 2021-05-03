package com.company.A;

public class HardDisk {
    private int volume;
    private int divisions;

    public HardDisk () {}

    public HardDisk(int volume, int divisions) {
        this.volume = volume;
        this.divisions = divisions;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDivisions() {
        return divisions;
    }

    public void setDivisions(int divisions) {
        this.divisions = divisions;
    }

    @Override
    public String toString() {
        return String.format("%sTB, %s divisions", this.volume, this.divisions);
    }
}
