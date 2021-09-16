package com.company;

public class MyLinkedList <E> implements Linked<E>{

    private MyNode<E> first;
    private MyNode<E> last;
    private int size = 0;

    public MyLinkedList() {
        last = new MyNode<>(null, null, null);
        first = new MyNode<>(null, null, last);
    }

    @Override
    public void addLast(E e) {
        MyNode<E> prev = last;
        prev.setCurrentElement(e);
        last = new MyNode<>(null, prev, null);
        prev.setNextElement(last);
        size++;
    }

    @Override
    public void addFirst(E e) {
        MyNode<E> next = first;
        first.setCurrentElement(e);
        first = new MyNode<>(null, null, next);
        next.setPrevElement(first);
        size++;
    }

    @Override
    public E getFirst() {
        return getElementByIndex(0);
    }

    @Override
    public E getLast() {
        return getElementByIndex(size - 1);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int index) {
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
        MyNode<E> target = first.getNextElement();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    @Override
    public E getNextElementByIndex(int index) {
        if(size == 0 || size == 1 || index >= size - 1) throw new IndexOutOfBoundsException();
        MyNode<E> target = first.getNextElement();
        for (int i = 0; i < index + 1; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    @Override
    public E getPrevElementByIndex(int index) {
        if(size == 0 || size == 1 || index == 0) throw new IndexOutOfBoundsException();
        MyNode<E> target = first.getNextElement();
        for (int i = 0; i < index - 1; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    private MyNode<E> getNextElement(MyNode<E> current) {
        return current.getNextElement();
    }

    @Override
    public String toString() {
        if(size == 0) return "[]";
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            str.append(getElementByIndex(i)).append(", ");
        }
        return str.substring(0, str.length() - 2) + "]";
    }

    private static class MyNode<E> {
        private E currentElement;
        private MyNode<E> nextElement;
        private MyNode<E> prevElement;

        private MyNode(E currentElement, MyNode<E> prevElement, MyNode<E> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public MyNode<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(MyNode<E> nextElement) {
            this.nextElement = nextElement;
        }

        public MyNode<E> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(MyNode<E> prevElement) {
            this.prevElement = prevElement;
        }
    }
}
