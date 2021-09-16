package com.company;

public interface Linked <E> {
     void addLast(E e);
     void addFirst(E e);
     int size();
     E getFirst();
     E getLast();
     E getElementByIndex(int index);
     E getNextElementByIndex(int index);
     E getPrevElementByIndex(int index);
}
