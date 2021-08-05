package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= 100; i++) {
            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
           if(flag) {
               list.add(i);
           }
        }
        System.out.println(list);
    }
}
