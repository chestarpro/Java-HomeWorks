package com.company;

import com.company.taskA.Juice;
import com.company.taskA.Liquid;
import com.company.taskB.Student;
import com.company.taskB.Tested;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Task - A
        List<Juice> juices = new ArrayList<>();
        juices.add(new Juice("apple juice"));
        juices.add(new Juice("orange juice"));
        pour(juices);

        System.out.println();

        // Task - B
        Student ivan = new Student("Ivan");
        Tested petr = () -> System.out.println("Testing Petr");
        ivan.getTest();
        petr.getTest();
        ((Tested) () -> System.out.println("Testing Sergey")).getTest();
    }

    public static void pour(List<? extends Liquid> list) {
        list.forEach(Liquid::pour);
    }
}