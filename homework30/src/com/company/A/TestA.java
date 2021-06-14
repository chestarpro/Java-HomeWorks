package com.company.A;

import java.util.ArrayList;

public class TestA {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ветер с моря дул");
        arrayList1.add("Нагонял беду");
        arrayList1.add("И сказал ты мне");
        arrayList1.add("Больше не приду");

        ArrayList<String> arrayList2 = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < arrayList1.size(); i = i + 2) {
            arrayList1.add(index, arrayList1.get(i));
            if(arrayList1.get(i).length() >= 15) {
                arrayList2.add(arrayList1.get(i));
            }
            index = index + 2;
        }

        arrayList2.remove("И сказал ты мне");

        System.out.println(arrayList1);
        System.out.println(arrayList2);
    }
}
