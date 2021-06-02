package com.company.A.classes;

import com.company.A.interfaces.Flying;
import com.company.A.interfaces.Swimming;

public class Duck implements Flying, Swimming {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
