package com.company.Restaurant;

import com.company.Human;

public class Client extends Human {
    private boolean regularCustomer;
    private int averageOrderCheck;
    private boolean faceControlPass;

    public Client(){}

    public Client(String name,
                  int age,
                  String address,
                  String gender,
                  boolean regularCustomer,
                  int averageOrderCheck,
                  boolean faceControlPass) {
        super(name, age, address, gender);
        this.regularCustomer = regularCustomer;
        this.averageOrderCheck = averageOrderCheck;
        this.faceControlPass = faceControlPass;
    }

    public boolean isRegularCustomer() {
        return regularCustomer;
    }

    public void setRegularCustomer(boolean regularCustomer) {
        this.regularCustomer = regularCustomer;
    }

    public int getAverageOrderCheck() {
        return averageOrderCheck;
    }

    public void setAverageOrderCheck(int averageOrderCheck) {
        this.averageOrderCheck = averageOrderCheck;
    }

    public boolean getFaceControlPass() {
        return faceControlPass;
    }

    public void setFaceControlPass(boolean faceControlPass) {
        this.faceControlPass = faceControlPass;
    }

    public void toOrder() {
        System.out.println("I want to order!");
    }

    public void toPay() {
        System.out.println("I want to pay");
    }

    public void callTheWaiter() {
        System.out.println("Аффиссьиаааант!"); // XD
    }


    private String getBooleanRegular(boolean regularCustomer) {
        if(!regularCustomer) return "Not a regular customer";
        else return "Regular customer";
    }

    @Override
    public String toString() {
        return String.format("""
                        ----------------------------------
                        Client:\s
                        Name - %s\s
                        Age - %s\s
                        Address - %s\s
                        Gender - %s\s
                        %s\s
                        Average Order Check - %s som
                        ----------------------------------""",
                getName(),
                getAge(),
                getAddress(),
                getGender(),
                getBooleanRegular(this.regularCustomer),
                this.averageOrderCheck);

    }
}
