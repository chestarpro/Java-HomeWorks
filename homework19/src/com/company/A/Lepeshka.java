package com.company.A;

import java.util.Locale;

public class Lepeshka extends Bread {

    public Lepeshka(){}

    public Lepeshka(String typeBread, double weight, double price) {
        super(typeBread, weight, price);
    }

    void drawPattern() {
        if (getWeight() <= 0) System.out.print("");
        else System.out.println("Put a pattern on the " + getTypeBread().toLowerCase(Locale.ROOT));
    }

    void varnishing() {
        if (getWeight() <= 0) System.out.print("");
        else System.out.println("Varnishing " + getTypeBread().toLowerCase(Locale.ROOT));
    }
}
