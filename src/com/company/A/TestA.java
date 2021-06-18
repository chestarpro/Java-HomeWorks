package com.company.A;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestA {
    public static void main(String[] args) {
        ArrayList<Cat> catArrayList = new ArrayList<>();
        LinkedList<Cat> catLinkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            catArrayList.add(new Cat("Cat" + (i+1)));
            catLinkedList.add(new Cat("Cat" + (i+1)));
        }
//____________________________________________________________________________________________________________________//
        long addMidArrayListBefore = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catArrayList.add(catArrayList.size() / 2, new Cat("CatMid" + (i+1)));
        }
        long addMidArrayListAfter = System.currentTimeMillis();
        long resAddMidArrayList = addMidArrayListAfter - addMidArrayListBefore;
        System.out.println("Выполнение добавление в средеину ArrayList заняло " + resAddMidArrayList + " миллисекунд");
//____________________________________________________________________________________________________________________//
        long addMidLinkedListBefore = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catLinkedList.add(catLinkedList.size() / 2, new Cat("CatMid" + (i+1)));
        }
        long addMidLinkedListAfter = System.currentTimeMillis();
        long resAddMidLinkedList = addMidLinkedListAfter - addMidLinkedListBefore;
        System.out.println("Выполнение добавление в средеину LinkedList заняло " + resAddMidLinkedList + " миллисекунд");
//____________________________________________________________________________________________________________________//
        long addStartEndArrayListBefore = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catArrayList.add(0, new Cat("CatStart" + (i+1)));
            catArrayList.add(catArrayList.size(), new Cat("CatEnd" + (i+1)));
        }
        long addStartEndArrayListAfter = System.currentTimeMillis();
        long resAddStartEndArrayList = addStartEndArrayListAfter - addStartEndArrayListBefore;
        System.out.println("Выполнение добавление в начало и конец ArrayList заняло " + resAddStartEndArrayList + " миллисекунд");
//____________________________________________________________________________________________________________________//
        long addStartEndLinkedListBefore = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catLinkedList.addFirst(new Cat("CatStart" + (i+1)));
            catLinkedList.addLast(new Cat("CatEnd" + (i+1)));
        }
        long addStartEndLinkedListAfter = System.currentTimeMillis();
        long resAddStartEndLinkedList = addStartEndLinkedListAfter - addStartEndLinkedListBefore;
        System.out.println("Выполнение добавление в начало и конец LinkedList заняло " + resAddStartEndLinkedList + " миллисекунд");
//____________________________________________________________________________________________________________________//
        long readMidEndArrayListBefore = System.currentTimeMillis();
        System.out.println(catArrayList.get(catArrayList.size() / 2));
        System.out.println(catArrayList.get(catArrayList.size() - 1));
        long readMidEndArrayListAfter = System.currentTimeMillis();
        long resReadMidEndArrayList = readMidEndArrayListAfter - readMidEndArrayListBefore;
        System.out.println("Выполнение считывания с середины и конца ArrayList заняло " + resReadMidEndArrayList + " миллисекунд");
//____________________________________________________________________________________________________________________//
        long readMidEndLinkedListBefore = System.currentTimeMillis();
        System.out.println(catLinkedList.get(catLinkedList.size() / 2));
        System.out.println(catLinkedList.getLast());
        long readMidEndLinkedListAfter = System.currentTimeMillis();
        long resReadMidEndLinkedList = readMidEndLinkedListAfter - readMidEndLinkedListBefore;
        System.out.println("Выполнение считывания с середины и конца LinkedList заняло " + resReadMidEndLinkedList + " миллисекунд");
//____________________________________________________________________________________________________________________//
        long removeMidStartArrayListBefore = System.currentTimeMillis();
        catArrayList.remove(catArrayList.size()/2);
        catArrayList.remove(0);
        long removeMidStartArrayListAfter = System.currentTimeMillis();
        long resRemoveMidStartArrayList = removeMidStartArrayListAfter - removeMidStartArrayListBefore;
        System.out.println("Выполнение удаления в середине и начале ArrayList заняло " + resRemoveMidStartArrayList + " миллисекунд");
//____________________________________________________________________________________________________________________//
        long removeMidStartLinkedListBefore = System.currentTimeMillis();
        catLinkedList.remove(catLinkedList.size() / 2);
        catLinkedList.removeFirst();
        long removeMidStartLinkedListAfter = System.currentTimeMillis();
        long resRemoveMidStartLinkedList = removeMidStartLinkedListAfter - removeMidStartLinkedListBefore;
        System.out.println("Выполнение удаления в середине и начале LinkedList заняло " + resRemoveMidStartLinkedList + " миллисекунд");
//____________________________________________________________________________________________________________________//
        long resArrayList = resAddMidArrayList + resAddStartEndArrayList + resReadMidEndArrayList + resRemoveMidStartArrayList;
        long resLinkedList = resAddMidLinkedList + resAddStartEndLinkedList + resReadMidEndLinkedList + resRemoveMidStartLinkedList;

        if (resArrayList < resLinkedList) {
            System.out.println("ArrayList быстрее");
        } else if (resArrayList > resLinkedList) {
            System.out.println("LinkedList быстрее");
        }
    }
}
