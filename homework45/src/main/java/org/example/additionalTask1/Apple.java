package org.example.additionalTask1;

public class Apple extends Fruits {
    public Apple() {
    }

    public Apple(String variety) {
        super(variety);

    }

    @Override
    public String toString() {
        return String.format("Apple: %s", getVariety());
    }
}
