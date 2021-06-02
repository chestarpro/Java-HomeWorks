package com.company.A.classes;

import com.company.A.interfaces.Swimming;

public class Ship implements Swimming {
    @Override
    public void swim() {
        System.out.println("Ship is swimming");
    }
}
