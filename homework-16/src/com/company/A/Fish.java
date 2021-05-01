package com.company.A;

public class Fish {
    private String kindOfFish;
    private String fishColor;
    private int fishAge;
    private String fishSize;
    private boolean isPredatory;

    public String getKindOfFish() {
        return kindOfFish;
    }

    public void setKindOfFish(String kindOfFish) {
        this.kindOfFish = kindOfFish;
    }

    public String getFishColor() {
        return fishColor;
    }

    public void setFishColor(String fishColor) {
        this.fishColor = fishColor;
    }

    public int getFishAge() {
        return fishAge;
    }

    public void setFishAge(int fishAge) {
        if(fishAge < 0) System.out.println("Error");
        else this.fishAge = fishAge;
    }

    public String getFishSize() {
        return fishSize;
    }

    public void setFishSize(String fishSize) {
        this.fishSize = fishSize;
    }

    public boolean getIsPredatory() {
        return isPredatory;
    }

    public void setIsPredatory(boolean predatory) {
        isPredatory = predatory;
    }

    public void printInfo() {
        if(!getIsPredatory()) {
            System.out.println("Fish:----------\n" +
                               "Kind of fish: " + getKindOfFish() +
                               "\nColor: " + getFishColor() +
                               "\nAge: " + getFishAge() +
                               "\nSize: " + getFishSize() +
                               "\nNot a predator\n");
        } else System.out.println("Fish:----------\n" +
                                  "Kind of fish: " + getKindOfFish() +
                                  "\nColor: " + getFishColor() +
                                  "\nAge: " + getFishAge() +
                                  "\nSize: " + getFishSize() +
                                  "\nCaution predatory fish!\n");
    }
}
