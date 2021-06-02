package com.company.A.classes;

import com.company.A.interfaces.Swimming;

public class Whale implements Swimming {
    @Override
    public void swim() {
        System.out.println("Whale is swimming");
    }
}
