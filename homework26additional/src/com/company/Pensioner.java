package com.company;

public class Pensioner extends Employee implements Comparable{

    public Pensioner() { }

    public Pensioner(String name, int age, int salary, int experience) {
        super(name, age, salary, experience);
    }

    @Override
    public int compareTo(Object o) {
        Pensioner pensioner = (Pensioner) o;
        if(getAge() < pensioner.getAge()) {
            return 1;
        }
        else if(getAge() == pensioner.getAge()) {
            return 0;
        }
        else return -1;
    }

    @Override
    public String toString() {
        return String.format("(Pensioner) name: %s, age: %s salary: %s, experience: %s",
                getName(), getAge(), getSalary(), getExperience());
    }
}
