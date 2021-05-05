package com.company;

import java.util.Arrays;

public class Farm {
    String addressFarm;
    Cow[] arrayCow;
    Sheep[] arraySheep;
    Horse[] arrayHorse;
    String fullNameOwner;

    public Farm(){}

    public Farm(String addressFarm, Cow[] arrayCow, Sheep[] arraySheep, Horse[] arrayHorse, String fullNameOwner) {
        this.addressFarm = addressFarm;
        this.arrayCow = arrayCow;
        this.arraySheep = arraySheep;
        this.arrayHorse = arrayHorse;
        this.fullNameOwner = fullNameOwner;
    }

    public String getAddressFarm() {
        return addressFarm;
    }

    public void setAddressFarm(String addressFarm) {
        this.addressFarm = addressFarm;
    }

    public Cow[] getArrayCow() {
        return arrayCow;
    }

    public void setArrayCow(Cow[] arrayCow) {
        this.arrayCow = arrayCow;
    }

    public Sheep[] getArraySheep() {
        return arraySheep;
    }

    public void setArraySheep(Sheep[] arraySheep) {
        this.arraySheep = arraySheep;
    }

    public Horse[] getArrayHorse() {
        return arrayHorse;
    }

    public void setArrayHorse(Horse[] arrayHorse) {
        this.arrayHorse = arrayHorse;
    }

    public String getFullNameOwner() {
        return fullNameOwner;
    }

    public String removeBrackets(String str) {
        return str.substring(1, str.length() -1);
    } // метод для удаления квадратных скобок [1, 2, 3] / 1, 2, 3//

    @Override
    public String toString() {
        return String.format("""
                        address:\s
                        %s
                        ----------------------------------
                        %s cows in a herd: %s.
                        ----------------------------------
                        %s sheep in a flock: %s.
                        ----------------------------------
                        %s horses in a herd: %s.
                        ----------------------------------
                        Owner full name:\s
                        %s
                        =====================================================
                        """,
                        this.addressFarm,
                        this.arrayCow.length,
                        removeBrackets(Arrays.toString(this.arrayCow)),
                        this.arraySheep.length,
                        removeBrackets(Arrays.toString(this.arraySheep)),
                        this.arrayHorse.length,
                        removeBrackets(Arrays.toString(this.arrayHorse)),
                        this.fullNameOwner);
    }
}
