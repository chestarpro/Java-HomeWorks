package com.company.Restaurant;

import com.company.Human;

public class Staff extends Human {
    private String position;
    private int salary;
    private int prize;
    private int fine; //Штраф
    private String experience;
    private int numberOfVacationDays;

    public Staff() {}

    public Staff(String name,
                 int age,
                 String address,
                 String gender,
                 String position,
                 int salary,
                 String experience) {
        super(name, age, address, gender);
        this.position = position;
        this.salary = salary;
        this.experience = experience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getNumberOfVacationDays() {
        return numberOfVacationDays;
    }

    public void setNumberOfVacationDays(int numberOfVacationDays) {
        this.numberOfVacationDays = numberOfVacationDays;
    }

    public void goToWork() {
        System.out.println(getName() + " Go to work");
    }

    public void goOnVacation() {
        System.out.println(getName() + " Go on vacation");
    }

    public void toBeLate () {
        System.out.println("Be late");
    }

    @Override
    public String toString() {
        return String.format("""
                        Name: %s\s
                        Age: %s\s
                        Address %s\s
                        Gender - %s\s
                        Position - %s \s
                        Salary - %s som\s
                        Experience - %s\s
                        ----------------------------------""",
                getName(),
                getAge(),
                getAddress(),
                getGender(),
                this.position,
                this.salary,
                this.experience);
    }
}
