package com.company.A;

public class Dog {
    private String dogBreed;
    private String dogName;
    private String dogColor;
    private String dogGender;
    private int dogAge;
    private double dogWeight;
    private boolean dogIsSpayed;

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogColor() {
        return dogColor;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        if (dogAge < 0) System.out.println("Error");
        else this.dogAge = dogAge;
    }

    public double getDogWeight() {
        return dogWeight;
    }

    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    public boolean getDogIsSpayed() {
        return dogIsSpayed;
    }

    public void setDogIsSpayed(boolean dogIsSpayed) {
        this.dogIsSpayed = dogIsSpayed;
    }

    public String getDogGender() {
        return dogGender;
    }

    public void setDogGender(String dogGender) {
        this.dogGender = dogGender;
    }

    public void printInfo() {
        if (!getDogIsSpayed()) {
            System.out.println("Dog:----------\n" +
                               "Breed: " + getDogBreed() +
                               "\nName: " + getDogName() +
                               "\nColor: " + getDogColor() +
                               "\nGender: " + getDogGender() +
                               "\nAge: " + getDogAge() +
                               "\nWeight: " + getDogWeight() + " kg" +
                               "\nThe dog is not spayed\n");
        }
         else System.out.println("Dog:----------\n" +
                                 "Breed: " + getDogBreed() +
                                 "\nName: " + getDogName() +
                                 "\nColor: " + getDogColor() +
                                 "\nGender: " + getDogGender() +
                                 "\nAge: " + getDogAge() +
                                 "\nWeight: " + getDogWeight() + " kg" +
                                 "\nDog spayed\n");
    }
}
