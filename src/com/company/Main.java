package com.company;

public class Main {

    public static void main(String[] args) {
	    Linked <String> myLinkedList = new MyLinkedList<>();

	    myLinkedList.addLast("B");
        myLinkedList.addLast("C");
	    myLinkedList.addFirst("A");

        System.out.println(myLinkedList);
        System.out.println("Размер листа = " + myLinkedList.size());
        System.out.println("Первый элемент листа = " + myLinkedList.getFirst());
        System.out.println("Последний элемент листа = " + myLinkedList.getLast());
        System.out.println("Элемент листа по индексу[1] = " + myLinkedList.getElementByIndex(1));

        System.out.println("Следующий элемент листа по индексу[1] = " + myLinkedList.getNextElementByIndex(1)); // Вот эти 2 метода я честно не понял дл чего нужны
        System.out.println("Предыдущий элемент листа по индексу[1] = " +myLinkedList.getPrevElementByIndex(1));


    }
}
