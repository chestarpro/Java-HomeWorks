package com.company.A;

public class Parrot {
    private String kindOfParrot;
    private String parrotName;
    private String parrotColor;
    private int parrotAge;
    private boolean isTalking;

    public String getKindOfParrot() {
        return kindOfParrot;
    }

    public void setKindOfParrot(String kindOfParrot) {
        this.kindOfParrot = kindOfParrot;
    }

    public String getParrotName() {
        return parrotName;
    }

    public void setParrotName(String parrotName) {
        this.parrotName = parrotName;
    }

    public String getParrotColor() {
        return parrotColor;
    }

    public void setParrotColor(String parrotColor) {
        this.parrotColor = parrotColor;
    }

    public int getParrotAge() {
        return parrotAge;
    }

    public void setParrotAge(int parrotAge) {
        if(parrotAge < 0) System.out.println("Error");
        else this.parrotAge = parrotAge;
    }

    public boolean getIsTalking() {
        return isTalking;
    }

    public void setIsTalking(boolean talking) {
        isTalking = talking;
    }

    public void printInfo() {
        if(!getIsTalking()) {
            System.out.println("Parrot:----------\n" +
                               "Kind of parrot: " + getKindOfParrot() +
                               "\nName: " + getParrotName() +
                               "\nColor: " + getParrotColor() +
                               "\nAge: " + getParrotAge() +
                               "\nCan't talk :( \n" );
        } else System.out.println("Parrot:----------\n" +
                                  "Kind of parrot: " + getKindOfParrot() +
                                  "\nName: " + getParrotName() +
                                  "\nColor: " + getParrotColor() +
                                  "\nAge" + getParrotAge() +
                                  "\nCan talk :) \n" +
                                  getParrotName() + " say: Vovka durak!\n");
    }
}
