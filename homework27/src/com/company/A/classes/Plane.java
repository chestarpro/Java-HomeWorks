package com.company.A.classes;

import com.company.A.interfaces.Flying;

public class Plane implements Flying {
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}
