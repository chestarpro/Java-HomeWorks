package com.company.A;

public class Cat {
    private String catBreed;
    private String catName;
    private String catGender;
    private String catColor;
    private int catAge;
    private double catWeight;
    private boolean catIsSpayed;

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatColor() {
        return catColor;
    }

    public void setCatColor(String catColor) {
        this.catColor = catColor;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        if(catAge < 0) System.out.println("Error");
        else this.catAge = catAge;
    }

    public double getCatWeight() {
        return catWeight;
    }

    public void setCatWeight(double catWeight) {
        this.catWeight = catWeight;
    }

    public boolean getCatIsSpayed() {
        return catIsSpayed;
    }

    public void setCatIsSpayed(boolean catIsSpayed) {
        this.catIsSpayed = catIsSpayed;
    }

    public String getCatGender() {
        return catGender;
    }

    public void setCatGender(String catGender) {
        this.catGender = catGender;
    }
    public void printInfo() {
        if(!getCatIsSpayed()) {
            System.out.println("Cat:----------\n" +
                               "Breed: " + getCatBreed() +
                               "\nName: " + getCatName() +
                               "\nColor: " + getCatColor() +
                               "\nGender: " + getCatGender() +
                               "\nAge: " + getCatAge() +
                               "\nWeight: " + getCatWeight() + " kg" +
                               "\nThe cat is not spayed\n");
        }
        else System.out.println("Cat:----------\n" +
                                "Breed: " + getCatBreed() +
                                "\nName: " + getCatName() +
                                "\nColor: " + getCatColor() +
                                "\nGender: " + getCatGender() +
                                "\nAge: " + getCatAge() +
                                "\nWeight: " + getCatWeight() + " kg" +
                                "\nCat spayed\n");
    }
}
