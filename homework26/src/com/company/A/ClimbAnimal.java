package com.company.A;

import com.company.A.interfaces.Climb;

public abstract class ClimbAnimal implements Climb { // Абстрактный класс зверей кторые могу карабкатся
    private String KindOfAnimal;
    private double weight;
    private int id;
    private static int count;

    public ClimbAnimal(){
    }

    public ClimbAnimal(String KindOfAnimal, double weight) {
        this.KindOfAnimal = KindOfAnimal;
        this.weight = weight;
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        ClimbAnimal.count = count;
    }

    public String getKindOfAnimal() {
        return KindOfAnimal;
    }

    public void setKindOfAnimal(String kindOfAnimal) {
        this.KindOfAnimal = kindOfAnimal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void climb(){
        System.out.println(getKindOfAnimal() + " карабкается!");
    }
}
