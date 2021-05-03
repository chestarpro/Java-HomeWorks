package com.company.A;

public class Display {
    private int inches;
    private String manufacturer;
    private String typeMatrix;

    public Display () {}

    public Display(int inches, String manufacturer, String typeMatrix) {
        this.inches = inches;
        this.manufacturer = manufacturer;
        this.typeMatrix = typeMatrix;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTypeMatrix() {
        return typeMatrix;
    }

    public void setTypeMatrix(String typeMatrix) {
        this.typeMatrix = typeMatrix;
    }

    @Override
    public String toString() {
        return String.format("%s Inch, %s, %s matrix", this.inches, this.manufacturer, this.typeMatrix);
    }
}
