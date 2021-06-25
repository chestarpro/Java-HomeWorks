package com.company.A;

import java.util.Objects;

public class Dog {
    private String name;
    private Integer weight;

    public Dog() { }

    public Dog(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, weight);
    }

    @Override
    public boolean equals(final Object o){
        if(o instanceof Dog) {
            final Dog dog = (Dog) o;
            return Objects.equals(name, dog.name)
                    && weight.equals(dog.weight);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("My name is %s, my weight is %s kg.",
                this.name, this.weight);
    }
}
