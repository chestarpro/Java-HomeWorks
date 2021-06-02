package com.company.A.classes;

import com.company.A.interfaces.Running;

public class Cat implements Running {
    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
