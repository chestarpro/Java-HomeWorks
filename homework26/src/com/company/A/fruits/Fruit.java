package com.company.A.fruits;

public abstract class Fruit {
    private String nameFruit;
    private boolean poisonous;

    public Fruit(){}

    public Fruit(String nameFruit, boolean poisonous) {
        this.nameFruit = nameFruit;
        this.poisonous = poisonous;
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }
}
