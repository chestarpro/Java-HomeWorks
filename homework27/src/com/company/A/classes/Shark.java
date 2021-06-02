package com.company.A.classes;

import com.company.A.interfaces.Swimming;

public class Shark implements Swimming {

    @Override
    public void swim() {
        System.out.println("Shark is swimming");
    }
}
