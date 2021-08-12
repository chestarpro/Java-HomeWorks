package org.example.additionalTask1;

public abstract class Fruits {
    private final int id;
    private String variety;
    private static int countFruits;

    public Fruits() {
        countFruits++;
        this.id = countFruits;
    }

    public Fruits(String variety) {
        this.variety = variety;
        countFruits++;
        this.id = countFruits;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getId() {
        return id;
    }
}
