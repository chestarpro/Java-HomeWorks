package com.company.A;

public class MyGeneric <F, S> {
    private F first;
    private S second;

    public MyGeneric(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public String getInfoFirst() {
        return first.getClass() + ", hashcode = " + first.hashCode();
    }

    public String getInfoSecond() {
       return second.getClass() + ", hashcode = " + second.hashCode();
    }

    public boolean check() {
        return first.getClass().equals(second.getClass())
                && first.hashCode() == second.hashCode();
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
