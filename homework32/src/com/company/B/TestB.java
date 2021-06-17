package com.company.B;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestB {
    public static void main(String[] args) {
        Cat[]cats = new Cat[50];
        Dog[]dogs = new Dog[50];
        LinkedList<Object> animals = new LinkedList<>();
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < 50; i++) {
            cats[i] = new Cat("Cat", i + 1);
            dogs[i] = new Dog("Dog", i + 1);
        }

        for(int i = 0; i < 50; i++) {
            animals.add(cats[i]);
            animals.add(dogs[i]);
        }
        System.out.println();
//            if(animals.add(new Cat())) {
//                catCount++;
//                if(catCount % 5 == 0) {
//                    animals.remove(catArrayList.get(i));
//                }
//            }
//            if(animals.add(new Dog())) {
//                dogCount++;
//                if(dogCount % 3 == 0) {
//                    animals.add(new Mouse("Mouse", i+1));
//                }
//            }
//        }
//        System.out.println(animals);
    }
}
