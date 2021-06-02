package com.company;

public class Main {

    public static void main(String[] args) {
        Pensioner[] pensioners = new Pensioner[5];
        pensioners[0] = new Pensioner("4", 70, 25000, 4);
        pensioners[1] = new Pensioner("2", 62, 25000, 4);
        pensioners[2] = new Pensioner("3", 65, 25000, 4);
        pensioners[3] = new Pensioner("5", 87, 25000, 4);
        pensioners[4] = new Pensioner("1", 60, 25000, 4);

        Merchant []merchants = new Merchant[5];
        merchants[0] = new Merchant("2", 30, 35000, 5);
        merchants[1] = new Merchant("1", 30, 31000, 5);
        merchants[2] = new Merchant("3", 30, 45000, 5);
        merchants[3] = new Merchant("5", 30, 100000, 5);
        merchants[4] = new Merchant("4", 30, 55000, 5);

        Firefighter []firefighters = new Firefighter[5];
        firefighters[0] = new Firefighter("1", 30, 40000, 10);
        firefighters[1] = new Firefighter("4", 30, 60000, 30);
        firefighters[2] = new Firefighter("2", 30, 45000, 12);
        firefighters[3] = new Firefighter("3", 30, 50000, 25);
        firefighters[4] = new Firefighter("5", 30, 80000, 36);

        sort(pensioners);
        sort(merchants);
        sort(firefighters);
    }
    public static void sort(Comparable[]comparable) {
        for (int i = 0; i < comparable.length; i++){
            for (int j = i; j < comparable.length; j++) {
                if(comparable[i].compareTo(comparable[j]) < 0) {
                    Comparable comparable1 = comparable[i];
                    comparable[i] = comparable[j];
                   comparable[j]= comparable1;
                }
            }
            System.out.println(comparable[i]);
        }
        System.out.println();
    }
}
