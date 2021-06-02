package com.company.A.classes;

import com.company.A.interfaces.Flying;

public class Carrot implements Flying {

    @Override
    public void fly() {
        System.out.println("Carrot is flying");
    }
}
