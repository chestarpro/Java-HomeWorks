package com.company.A.bread;

public abstract class Bread implements Bake {
    private String name;
    private double weight;
    private String flourGrade;
    private double price;

    public Bread(){}

    public Bread(String name, double weight, String flourGrade, double price) {
        this.name = name;
        this.weight = weight;
        this.flourGrade = flourGrade;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFlourGrade() {
        return flourGrade;
    }

    public void setFlourGrade(String flourGrade) {
        this.flourGrade = flourGrade;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void baked() {
        System.out.println("Bake: " + toString() + "\n");
    }
}
