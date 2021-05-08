package com.company.A;

public class Main {

    public static void main(String[] args) {
	    Bread bread = new Bread("Regular bread",250.0, 11.50);
	    bread.bake();
	    bread.pack();
        System.out.println(bread);

	    Lepeshka lepeshka = new Lepeshka("Lepeshka",200.0, 30);
        lepeshka.drawPattern();
        lepeshka.bake();
        lepeshka.varnishing();
        lepeshka.pack();
        System.out.println(lepeshka);


        Lavash lavash = new Lavash("Lavash", "Elite lavash from Dilijan", 120.5, 52.89);
        lavash.bake();
        lavash.wrap();
        lavash.pack();
        System.out.println(lavash);


        Baguette baguette = new Baguette("Baguette", "Provencal baguette", 40, 8, 180, 29);
        baguette.scarring();
        baguette.bake();
        baguette.pack();
        System.out.println(baguette);
    }
}
