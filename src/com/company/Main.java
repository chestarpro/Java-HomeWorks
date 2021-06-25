package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        Set<String> hashSet = new HashSet<>(arrayList);

        arrayList.removeAll(arrayList);
        arrayList.addAll(hashSet);
        System.out.println(arrayList);



//        for (int i = 0; i < arrayList.size(); i++) {
//            for (String j : hashSet) {
//                if(arrayList.get(i).equals(j)) {
//                    arrayList.remove(arrayList.get(i));
//                }
//            }
//        }

    }
}
