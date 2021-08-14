package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<City> cityArrayList = new ArrayList<>();
        cityArrayList.add(new City("Беловодское", 3131));
        cityArrayList.add(new City("Бишкек", 312));
        cityArrayList.add(new City("Нарын", 3522));
        cityArrayList.add(new City("Кара-Балта", 3133));
        cityArrayList.add(new City("Сокулук", 3134));
        cityArrayList.add(new City("Лебединовка", 3147));
        cityArrayList.add(new City("Ош", 3222));
        cityArrayList.add(new City("Талас", 3422));
        cityArrayList.add(new City("Кант", 3132));
        cityArrayList.add(new City("Кемин", 3135));
        cityArrayList.add(new City("Узген", 3233));

        Set<City> hashSetEven = new HashSet<>();
        Set<City> treeSetOdd = new TreeSet<>();

        // Если код города чётный сохранить его в HashSet, если код города нечетный в TreeSet
        cityArrayList.stream().allMatch(city -> city.getCode() % 2 == 0 ? hashSetEven.add(city) : treeSetOdd.add(city));

        // Вывести список в порядке убывания.
        printDesc(cityArrayList);

        // Удалить те города, в названии которых больше 5 букв из TreeSet.
        treeSetOdd.removeIf(city -> city.getName().length() > 5);

        // Вывести список в порядке возрастания.
        printAsc(cityArrayList);
    }

    public static void printDesc(List<City> list) {
        TreeSet<City> treeSet = new TreeSet<>(list);
        Iterator<City> desc = treeSet.descendingIterator();
        System.out.println("По убыванию:");
        while (desc.hasNext())
            System.out.println(desc.next());
    }

    public static void printAsc(List<City> list) {
        TreeSet<City> treeSet = new TreeSet<>(list);
        System.out.println("\nПо возрастанию:");
        for (City city : treeSet)
            System.out.println(city);
    }
}
