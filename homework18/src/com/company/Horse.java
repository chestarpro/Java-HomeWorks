package com.company;

public class Horse {
    private double weight;
    private int age;
    private String gender;
    private String nickname;

    public Horse(){}

    public Horse(double weight, int age, String gender, String nickname) {
        this.weight = weight;
        if(age < 0) {
            System.out.println("(Horse " + nickname +"'s age error!)");
        } else { this.age = age; }
        this.gender = gender;
        this.nickname = nickname;
    }

    public double getWeight() { return weight; }

    public void setWeight(double weight) { this.weight = weight; }

    public int getAge() { return age; }

    public void setAge(int age) {
        if(age < 0) System.out.println("(Horse " + this.nickname +"'s age error!)");
        else this.age = age;
    }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getNickname() { return nickname; }

    public void setNickname(String nickname) { this.nickname = nickname; }

    @Override
    public String toString() {
        return String.format("\nweight %skg | age %s | %s | name: %s",
                            this.weight, this.age, this.gender, this.nickname);
    }
}
