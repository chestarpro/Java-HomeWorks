package com.company.A;

import com.company.A.fruits.Banana;
import com.company.A.fruits.Fruit;
import com.company.A.fruits.Karambola;
import com.company.A.fruits.Mango;

public class Main {

    public static void main(String[] args) {
        Fruit mango = new Mango("Манго", false);
        Fruit banana = new Banana("Банан", false);
        Fruit karambola = new Karambola("Карамбола", true);

        Monkey lemur = new Monkey("Лемур", 6);
        System.out.println(lemur);
        lemur.climb();
        lemur.eatEdibleFruit(mango);
        lemur.eatEdibleFruit(banana);
        lemur.eatEdibleFruit(karambola);

        System.out.println();

        Monkey gorilla = new Monkey("Горилла", 200);
        System.out.println(gorilla);
        gorilla.carryOnTheBack(lemur);
    }
}
