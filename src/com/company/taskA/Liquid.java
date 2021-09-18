package com.company.taskA;

public abstract class Liquid {
    private String name;

    public Liquid(String name) {
        this.name = name;
    }

    public void pour() {
        System.out.println("Pour the " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}