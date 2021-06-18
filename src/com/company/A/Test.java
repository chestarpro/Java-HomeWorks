package com.company.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MonthsOfTheYear[] array = new MonthsOfTheYear[12];
        ArrayList<MonthsOfTheYear> arrayList = new ArrayList<>();
        LinkedList<MonthsOfTheYear> linkedList = new LinkedList<>();

        fill(array);
        fill(arrayList);
        fill(linkedList);

        System.out.printf("""
                        Array before sorting: %s
                        ArrayList before sorting: %s
                        LinkedList before sorting: %s
                        -------------------------------------------------------------""",
                Arrays.toString(array), arrayList, linkedList);

        sort(array);
        sort(arrayList);
        sort(linkedList);

        System.out.printf("""
                        ----------------------------------------------------------------
                        Array after sorting: %s
                        ArrayList after sorting: %s
                        LinkedList after sorting: %s
                        """,
                Arrays.toString(array), arrayList, linkedList);
    }

    public static void sort(MonthsOfTheYear[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i].ordinal() <= array[j].ordinal()) {
                    MonthsOfTheYear temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void sort(ArrayList<MonthsOfTheYear> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if(arrayList.get(i).ordinal() <= arrayList.get(j).ordinal()) {
                    MonthsOfTheYear temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
    }

    public static void sort(LinkedList<MonthsOfTheYear> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            for (int j = 0; j < linkedList.size(); j++) {
                if(linkedList.get(i).ordinal() <= linkedList.get(j).ordinal()) {
                    MonthsOfTheYear temp = linkedList.get(i);
                    linkedList.set(i, linkedList.get(j));
                    linkedList.set(j, temp);
                }
            }
        }
    }

    public static void fill(MonthsOfTheYear[]array) {
        for (int i = 0; i < array.length; i++) {
            switch (i) {
                case 0 -> array[i] = MonthsOfTheYear.MARCH;
                case 1 -> array[i] = MonthsOfTheYear.FEBRUARY;
                case 2 -> array[i] = MonthsOfTheYear.DECEMBER;
                case 3 -> array[i] = MonthsOfTheYear.NOVEMBER;
                case 4 -> array[i] = MonthsOfTheYear.JUNE;
                case 5 -> array[i] = MonthsOfTheYear.MAY;
                case 6 -> array[i] = MonthsOfTheYear.JULY;
                case 7 -> array[i] = MonthsOfTheYear.SEPTEMBER;
                case 8 -> array[i] = MonthsOfTheYear.AUGUST;
                case 9 -> array[i] = MonthsOfTheYear.APRIL;
                case 10 -> array[i] = MonthsOfTheYear.OCTOBER;
                case 11 -> array[i] = MonthsOfTheYear.JANUARY;
            }
        }
    }

    public static void fill(ArrayList <MonthsOfTheYear> arrayList) {
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0 -> arrayList.add(MonthsOfTheYear.DECEMBER);
                case 1 -> arrayList.add(MonthsOfTheYear.FEBRUARY);
                case 2 -> arrayList.add(MonthsOfTheYear.MARCH);
                case 3 -> arrayList.add(MonthsOfTheYear.APRIL);
                case 4 -> arrayList.add(MonthsOfTheYear.MAY);
                case 5 -> arrayList.add(MonthsOfTheYear.OCTOBER);
                case 6 -> arrayList.add(MonthsOfTheYear.JULY);
                case 7 -> arrayList.add(MonthsOfTheYear.AUGUST);
                case 8 -> arrayList.add(MonthsOfTheYear.SEPTEMBER);
                case 9 -> arrayList.add(MonthsOfTheYear.NOVEMBER);
                case 10 -> arrayList.add(MonthsOfTheYear.JUNE);
                case 11 -> arrayList.add(MonthsOfTheYear.JANUARY);
            }
        }
    }

    public static void fill(LinkedList <MonthsOfTheYear> linkedList) {
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0 -> linkedList.add(MonthsOfTheYear.NOVEMBER);
                case 1 -> linkedList.add(MonthsOfTheYear.DECEMBER);
                case 2 -> linkedList.add(MonthsOfTheYear.JULY);
                case 3 -> linkedList.add(MonthsOfTheYear.SEPTEMBER);
                case 4 -> linkedList.add(MonthsOfTheYear.MAY);
                case 5 -> linkedList.add(MonthsOfTheYear.JUNE);
                case 6 -> linkedList.add(MonthsOfTheYear.MARCH);
                case 7 -> linkedList.add(MonthsOfTheYear.AUGUST);
                case 8 -> linkedList.add(MonthsOfTheYear.APRIL);
                case 9 -> linkedList.add(MonthsOfTheYear.JANUARY);
                case 10 -> linkedList.add(MonthsOfTheYear.OCTOBER);
                case 11 -> linkedList.add(MonthsOfTheYear.FEBRUARY);
            }
        }
    }
}
