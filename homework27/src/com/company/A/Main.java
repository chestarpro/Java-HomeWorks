package com.company.A;

import com.company.A.classes.*;
import com.company.A.interfaces.Flying;
import com.company.A.interfaces.Running;
import com.company.A.interfaces.Swimming;

public class Main {

    public static void main(String[] args) {
        Swimming[] swimming = new Swimming[5];
        swimming[0] = new Duck();
        swimming[1] = new Shark();
        swimming[2] = new Human();
        swimming[3] = new Ship();
        swimming[4] = new Whale();

        Flying[] flying = new Flying[3];
        flying[0] = new Duck();
        flying[1] = new Plane();
        flying[2] = new Carrot();

        Running[] running = new Running[2];
        running[0] = new Human();
        running[1] = new Cat();

        getInterfaceSwim(swimming);
        getInterfaceFly(flying);
        getInterfaceRun(running);
    }
    public static void getInterfaceSwim(Swimming[]swimming) {
        for (Swimming value : swimming) {
            if (value != null) {
                value.swim();
            }
        }
        System.out.println("------------------------------");
    }
    public static void getInterfaceFly(Flying[]flying) {
        for (Flying value : flying) {
            if (value != null) {
                value.fly();
            }
        }
        System.out.println("------------------------------");
    }
    public static void getInterfaceRun(Running[]running){
        for(Running value : running) {
            if(value != null) {
                value.run();
            }
        }
        System.out.println("------------------------------");
    }
}
