package com.company.A;

import java.util.Locale;

public class Lavash extends Bread {
    private String tradeName;

    public Lavash () {}

    public Lavash (String typeBread, String tradeName, double weight, double price) {
        super(typeBread, weight, price);
        this.tradeName = tradeName;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    @Override
    void bake() {
        if (getWeight() <= 0 ) System.out.print("");
        else System.out.println("I'm " + this.tradeName + ", i was baked");
    }

    void wrap() {
        if (getWeight() <= 0 ) System.out.print("");
        else System.out.println("Wrap " + getTypeBread().toLowerCase(Locale.ROOT));
    }

    @Override
    public String toString() {
        if (getWeight() > 0)
        return String.format("Product type: %s, trade name: %s, weight: %s gram, price: %s som\n",
                getTypeBread().toLowerCase(Locale.ROOT), this.tradeName, getWeight(), getPrice());
        else return "--------------------\n";
    }
}
