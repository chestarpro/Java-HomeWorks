package com.company.Restaurant;

public class Security extends Staff {
    private boolean armed;
    private String weaponType;

    public Security(){}

    public Security(String name,
                    int age,
                    String address,
                    String gender,
                    String position,
                    int salary,
                    String experience,
                    boolean armed) {
        super(name, age, address, gender, position, salary, experience);
        this.armed = armed;
        this.weaponType = "Glock 18";
    }

    public boolean getArmed() {
        return armed;
    }

    public void setArmed(boolean armed) {
        this.armed = armed;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public void faceControl(String name, boolean client) {
        if(!client) System.out.println("\n" + name + " you did not pass face control");
        else System.out.println("\nWelcome " + name +"!");
    }

    public void kickPeopleOut() {
        System.out.println("\nKick People Out!");
    }

    @Override
    public void toBeLate () {
        setFine(500);
        System.out.println(getName() + " was late for work! fine " + getFine() + " som");
        setSalary(getSalary() - getFine());
    }

    private String getInfoWeapon(boolean armed) {
        if(armed) return "Armed, weapon type: " + getWeaponType();
        else return "Not armed";
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
                        %s\s
                        ----------------------------------""",
                getPosition(),
                getName(),
                getAge(),
                getAddress(),
                getGender(),
                getSalary(),
                getExperience(),
                getInfoWeapon(this.armed));
    }

}
