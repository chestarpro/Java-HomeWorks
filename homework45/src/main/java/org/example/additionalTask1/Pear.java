package org.example.additionalTask1;

public class Pear extends Fruits {
    public Pear() {}

    public Pear(String variety) {
        super(variety);
    }

    @Override
    public String toString() {
        return String.format("Pear: %s", getVariety());
    }
}
