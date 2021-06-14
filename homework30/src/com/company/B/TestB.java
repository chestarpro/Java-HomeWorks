package com.company.B;

import java.util.ArrayList;
import java.util.Random;

public class TestB {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListOdd = new ArrayList<>();
        ArrayList<Integer> arrayListEven = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            arrayList.add(new Random().nextInt(100 + 1 - 1) + 1);
            if(arrayList.get(i) % 2 == 0) {
                arrayListEven.add(arrayList.get(i));
            } else arrayListOdd.add(arrayList.get(i));
        }
        System.out.println("Even numbers: " + arrayListEven);
        System.out.println("Odd numbers: " + arrayListOdd);
    }
}
