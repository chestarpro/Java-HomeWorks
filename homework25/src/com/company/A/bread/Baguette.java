package com.company.A.bread;

public class Baguette extends Bread {
    private int lengthBaguette;

    public Baguette(){}

    public Baguette(String name, double weight, String flourGrade, double price, int lengthBaguette) {
        super(name, weight, flourGrade, price);
        this.lengthBaguette = lengthBaguette;
    }

    public int getLengthBaguette() {
        return lengthBaguette;
    }

    public void setLengthBaguette(int lengthBaguette) {
        this.lengthBaguette = lengthBaguette;
    }

    @Override
    public String toString(){
        return String.format("%s, weight: %s gram, flour grade: %s, price: %s som, %s sm",
                getName(), getWeight(), getFlourGrade(), getPrice(), this.lengthBaguette);
    }
}
