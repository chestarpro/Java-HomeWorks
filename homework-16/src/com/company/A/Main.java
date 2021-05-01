package com.company.A;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); //Dogs
        dog1.setDogBreed("Poodle");   dog1.setDogName("Barbie"); dog1.setDogGender("Female");
        dog1.setDogColor("White");    dog1.setDogAge(6);         dog1.setDogWeight(35.4);
        dog1.setDogIsSpayed(true);    dog1.printInfo();

        Dog dog2 = new Dog();
        dog2.setDogBreed("Doberman"); dog2.setDogName("Baron");  dog2.setDogGender("Male");
        dog2.setDogColor("Black");    dog2.setDogWeight(55.4);   dog2.setDogAge(8);
        dog2.setDogIsSpayed(false);   dog2.printInfo();
//--------------------------------------------------------------------------------------------------------------------//
        Cat cat1 = new Cat(); //Cats
        cat1.setCatBreed("Sphinx");     cat1.setCatName("Barsik"); cat1.setCatGender("Male");
        cat1.setCatColor("Grey");       cat1.setCatAge(5);         cat1.setCatWeight(4.5);
        cat1.setCatIsSpayed(true);      cat1.printInfo();

        Cat cat2 = new Cat();
        cat2.setCatBreed("Maine Coon"); cat2.setCatName("Meow");   cat2.setCatGender("Female");
        cat2.setCatColor("Dark grey");  cat2.setCatAge(10);        cat2.setCatWeight(6.7);
        cat2.setCatIsSpayed(false);     cat2.printInfo();
//--------------------------------------------------------------------------------------------------------------------//
        Fish fish1 = new Fish(); //Fishes
        fish1.setKindOfFish("Koi carps");    fish1.setFishColor("Orange");  fish1.setFishSize("Middle");
        fish1.setFishAge(10);                fish1.setIsPredatory(false);   fish1.printInfo();

        Fish fish2 = new Fish();
        fish2.setKindOfFish("Lavraki fish"); fish2.setFishColor("Grey");    fish2.setFishSize("Small");
        fish2.setFishAge(3);                 fish2.setIsPredatory(true);    fish2.printInfo();
//--------------------------------------------------------------------------------------------------------------------//
        Parrot parrot1 = new Parrot(); //Parrots
        parrot1.setKindOfParrot("Amazon");        parrot1.setParrotName("Steve");        parrot1.setIsTalking(true);
        parrot1.setParrotAge(20);                 parrot1.setParrotColor("Green");       parrot1.printInfo();

        Parrot parrot2 = new Parrot();
        parrot2.setKindOfParrot("Griff parrot");  parrot2.setParrotName("Griffy");       parrot2.setParrotAge(15);
        parrot2.setParrotColor("Dark grey, with purple parts on the wings and tail");    parrot2.setIsTalking(false);
        parrot2.printInfo();
    }
}
