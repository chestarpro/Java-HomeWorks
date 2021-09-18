package com.company.taskB;

public class Student implements Tested {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void getTest() {
        System.out.println("Testing " + name);
    }
}
