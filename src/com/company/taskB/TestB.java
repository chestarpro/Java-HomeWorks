package com.company.taskB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TestB {
    public static void main(String[] args) {
        List<Integer> integerList = addRandomNumbersList(10);
        System.out.print("List: " + integerList + "\nEven numbers -> ");

        integerList
                .stream()
                .filter(x -> x % 2 == 0)
                .forEach(i -> System.out.print(i + " "));

        System.out.print("\nOdd numbers +10 -> ");

        List<Integer> oddList = integerList
                .stream()
                .filter(x -> x % 2 == 1)
                .map(i -> i + 10)
                .collect(Collectors.toList());

        oddList.forEach(i -> System.out.print(i + " "));
    }

    public static List<Integer> addRandomNumbersList(Integer listSize) {
        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();
        final int MAX = 100;
        final int MIN = 1;
        for (int i = 0; i < listSize; i++) {
            integerList.add(random.nextInt(MAX + MIN - 1) + MIN);
        }
        return integerList;
    }
}