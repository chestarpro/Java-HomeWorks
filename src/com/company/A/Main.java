package com.company.A;

public class Main {

    public static void main(String[] args) {
	    MyGeneric<String, Integer> myGeneric = new MyGeneric<>("first", 2);

        System.out.println(myGeneric.getInfoFirst() + "\n" +
                myGeneric.getInfoSecond() + "\n" +
                myGeneric.getFirst() + "\n" +
                myGeneric.getSecond() + "\n" +
                myGeneric.check());
    }
}
