package com.company.A;

import java.util.Locale;

public class Bread {
    private String typeBread;
    private double weight;
    private double price;

    public Bread() { }

    public Bread(String typeBread, double weight, double price) {
        this.typeBread = typeBread;
        if (weight <= 0) {
            System.out.println("Error! Fake " + typeBread.toLowerCase(Locale.ROOT));
        } else {
            this.weight = weight;
        }
        this.price = price;
    }

    public String getTypeBread() { return typeBread; }

    public void setTypeBread(String typeBread) { this.typeBread = typeBread; }

    public double getWeight() { return weight; }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("\nError! Fake " + this.typeBread);
        } else {
            this.weight = weight;
        }
    }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        if(this.weight > 0) {
            return String.format("Product type: %s, weight: %s gram, price: %s som\n",
                    this.typeBread.toLowerCase(Locale.ROOT), this.weight, this.price);
        } else return "--------------------\n";

    }

    void bake() {
        if (this.weight <= 0) System.out.print("");
        else System.out.println(this.typeBread + " was baked!");
    }

    void pack() {
        if (this.weight <= 0) System.out.print("");
         else System.out.println(this.typeBread + " is packed!");
    }
}
