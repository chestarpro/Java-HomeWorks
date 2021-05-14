package com.company.Restaurant;

public class Waiter extends Staff {

    public Waiter(){}

    public Waiter(String name,
                  int age,
                  String address,
                  String gender,
                  String position,
                  int salary,
                  String experience) {
        super(name, age, address, gender, position, salary, experience);
    }

    public void acceptTheOrder() {
        System.out.println("What do you want to order?");
    }

    public void deliverTheOrder() {
        System.out.println("Here is your order");
    }

    public void calculate() {
        System.out.println("Your bill :)");
    }

    @Override
    public void goOnVacation() {
        setNumberOfVacationDays(12);
        System.out.println(getName() + " Going on vacation for " + getNumberOfVacationDays() + " days" );
    }

    @Override
    public void toBeLate () {
        setFine(800);
        System.out.println(getName() + " was late for work! fine " + getFine() + " som");
        setSalary(getSalary() - getFine());
    }

    @Override
    public String toString() {
        return String.format("""
                        ----------------------------------
                        Position - %s\s
                        Name - %s\s
                        Age - %s\s
                        Address - %s\s
                        Gender - %s\s
                        Salary - %s som
                        Experience - %s\s
                        ----------------------------------""",
                getPosition(),
                getName(),
                getAge(),
                getAddress(),
                getGender(),
                getSalary(),
                getExperience());
    }
}
