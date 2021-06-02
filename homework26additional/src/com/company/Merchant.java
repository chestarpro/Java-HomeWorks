package com.company;

public class Merchant extends Employee implements Comparable{

    public Merchant() {}

    public Merchant(String name, int age, int salary, int experience) {
        super(name, age, salary, experience);
    }

    @Override
    public int compareTo(Object o) {
        Merchant merchant = (Merchant) o;
        if(getSalary() < merchant.getSalary()) {
            return 1;
        }
        else if(getSalary() == merchant.getSalary()) {
            return 0;
        }
        else return -1;
    }

    @Override
    public String toString() {
        return String.format("(Merchant) name: %s, age: %s salary: %s, experience: %s",
                getName(), getAge(), getSalary(), getExperience());
    }
}