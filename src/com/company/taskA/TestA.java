package com.company.taskA;

import java.util.*;
import java.util.stream.Collectors;

public class TestA {
    public static void main(String[] args) {
        Map<Integer, String> map = addMap();
        System.out.println("HasMap: " + map);

        List<String> stringList = map.entrySet()
                .stream()
                .filter(x -> x.getKey() > 5)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        System.out.println("Key > 5: " + stringList);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(map.entrySet()
                        .stream()
                        .filter(x -> x.getKey() % 3 == 0)
                        .map(Map.Entry::getValue)
                        .collect(Collectors.toList()));
        System.out.println("Key % 3: " + stringBuilder.substring(1, stringBuilder.length() - 1));

        try {
            System.out.println("Multiply all key, where value length > 5 = " + map.entrySet()
                    .stream()
                    .filter(x -> x.getValue().length() > 5)
                    .map(Map.Entry::getKey)
                    .reduce((a, b) -> a * b).get()
            );
        } catch (NoSuchElementException e) {
            System.out.println(0);
        }
    }

    public static Map<Integer, String> addMap() {
        Random random = new Random();
        Map<Integer, String> map = new HashMap<>();

        while (map.size() < 10) {
            Integer randomKey = random.nextInt(20 + 1 - 1) + 1;
            map.put(randomKey, "Text" + randomKey);
        }
        return map;
    }
}