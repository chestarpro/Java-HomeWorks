package com.company;

public class Firefighter extends Employee implements Comparable{

    public Firefighter() {
    }

    public Firefighter(String name, int age, int salary, int experience) {
        super(name, age, salary, experience);
    }

    @Override
    public int compareTo(Object o) {
        Firefighter firefighter = (Firefighter) o;
        if(getExperience() < firefighter.getExperience()) {
            return 1;
        }
        else if(getExperience() == firefighter.getExperience()) {
            return 0;
        }
        else return -1;
    }

    @Override
    public String toString() {
        return String.format("(Firefighter) name: %s, age: %s salary: %s, experience: %s",
                getName(), getAge(), getSalary(), getExperience());
    }
}
