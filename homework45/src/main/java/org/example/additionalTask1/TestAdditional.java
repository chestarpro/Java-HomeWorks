package org.example.additionalTask1;

import java.util.*;

public class TestAdditional {
    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<>();

        fruits.add(new Apple("Грушовка"));
        fruits.add(new Apple("Авангард"));
        fruits.add(new Apple("Симиренко"));

        fruits.add(new Pear("Лимонка"));
        fruits.add(new Pear("Белолистка"));
        fruits.add(new Pear("Дюшес"));

        fruits.add(new Apricot("Графиня", true));
        fruits.add(new Apricot("Гритиказ", false));
        fruits.add(new Apricot("Водолей", true));

        Map<Integer, Fruits> map = addFruits(fruits);
        printMap(map);

        removeAllApple(map);
        printMap(map);

        List<Fruits> wormyApricots = sortWormyApricot(map);
        printMap(map);

        System.out.println("ArrayList: \n" + wormyApricots);
    }

    public static Map<Integer, Fruits> addFruits(List<Fruits> fruits) {

        Map<Integer, Fruits> map = new HashMap<>();

        for (Fruits fruit: fruits) {
            map.put(fruit.getId(), fruit);
        }
        return map;
    }

    public static void removeAllApple(Map<Integer, Fruits> map) {

        map.entrySet().removeIf(entry -> entry.getValue() instanceof Apple);
    }

    public static List<Fruits> sortWormyApricot(Map<Integer, Fruits> map) {

        List<Fruits> list = new ArrayList<>();

        for (Map.Entry<Integer, Fruits> entry : map.entrySet()) {

           if(entry.getValue() instanceof Apricot && ((Apricot) entry.getValue()).isWormy()) {
               list.add(entry.getValue());
           }
        }

        map.entrySet().removeIf(entry -> entry.getValue() instanceof Apricot && ((Apricot) entry.getValue()).isWormy());

        return list;
    }

    public static void printMap(Map<Integer, Fruits> map) {

        System.out.println("HashMap: ");

        for (Map.Entry<Integer, Fruits> entry : map.entrySet()) {

            System.out.println(entry.getValue());
        }
        System.out.println();
    }
}
