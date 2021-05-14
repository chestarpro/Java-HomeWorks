package com.company.Restaurant;

public class Cook extends Staff {
    private String whatDishesDoesCooks;
    private String specialty;
    private String certificates;
    private String inventDishes;

    public Cook() {}

    public Cook(String name,
                int age,
                String address,
                String gender,
                String position,
                int salary,
                String experience,
                String whatDishesDoesCooks,
                String specialty,
                String certificates) {
        super(name, age, address, gender, position,salary, experience);
        this.whatDishesDoesCooks = whatDishesDoesCooks;
        this.specialty = specialty;
        this.certificates = certificates;
    }

    public String getWhatDishesDoesCooks() {
        return whatDishesDoesCooks;
    }

    public void setWhatDishesDoesCooks(String whatDishesDoesCooks) {
        this.whatDishesDoesCooks = whatDishesDoesCooks;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }

    public void goGroceryShopping() {
        System.out.println("Go grocery shopping");
    }

    public void inventDishes(String inventDishes) {
        this.inventDishes = inventDishes;
    }

    @Override
    public void goOnVacation() {
        setNumberOfVacationDays(5);
        System.out.println(getName() + " Going on vacation for " + getNumberOfVacationDays() + " days" );
    }

    public void cookTheDish() {
        System.out.println("Cook the " + this.inventDishes);
    }

    @Override
    public void toBeLate () {
        setFine(1000);
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
                        What dishes does cooks - %s\s
                        Specialty - %s\s
                        Certificates - %s
                        ----------------------------------""",
                getPosition(),
                getName(),
                getAge(),
                getAddress(),
                getGender(),
                getSalary(),
                getExperience(),
                this.whatDishesDoesCooks,
                this.specialty,
                this.certificates);
    }
}
