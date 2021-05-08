package com.company.A;

import java.util.Locale;

public class Baguette extends Bread {
    private String tradeName;
    private int length;
    private int scarring;

    public Baguette(String typeBread, String tradeName, int length, int scarring, double weight, double price) {
        super(typeBread, weight, price);
        this.tradeName = tradeName;
        this.length = length;
        this.scarring = scarring;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getScarring() {
        return scarring;
    }

    public void setScarring(int scarring) {
        this.scarring = scarring;
    }

    void scarring() {
        if (getWeight() <= 0) System.out.print("");
        else System.out.println("Scarring " + getTypeBread().toLowerCase(Locale.ROOT));
    }

    @Override
    void pack() {
        if (getWeight() > 0) System.out.println("Pack only in an ecological bag!");
        else System.out.print("");
    }

    @Override
    public String toString() {
        if(getWeight() > 0)
        return String.format("Product type: %s, trade name: %s, length: %s sm, number of scarring: %s, weight: %s gram, price: %s som ",
                getTypeBread().toLowerCase(Locale.ROOT), this.tradeName, this.length, this.scarring, getWeight(), getPrice());
        else return "--------------------\n";
    }
}
