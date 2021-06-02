package com.company.A.classes;

import com.company.A.interfaces.Running;
import com.company.A.interfaces.Swimming;

public class Human implements Running, Swimming {
    @Override
    public void run() {
        System.out.println("Human is running");
    }

    @Override
    public void swim() {
        System.out.println("Human is swimming");
    }
}
