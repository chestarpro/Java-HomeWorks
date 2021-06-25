package com.company.A;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();

        Set<Dog> dogSet = new HashSet<>();

        while (dogSet.size() != 40) {
            int weight = random.nextInt(40 + 1 - 1) + 1;
            String name = "Dalmatian" + weight;
            dogSet.add(new Dog(name, weight));
        }

        for (Dog dog : dogSet) {
            System.out.println(dog);
        }
    }
}
