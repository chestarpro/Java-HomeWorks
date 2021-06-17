package com.company.B;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestB {
    public static void main(String[] args) {
        LinkedList<Object> animalsLinkedList = new LinkedList<>();
        int catCount = 0;
        int dogCount = 0;
        int mouseCount = 0;

        for (int i = 0; i < 50; i++) {
            animalsLinkedList.add(new Cat("Cat", i + 1));
            animalsLinkedList.add(new Dog("Dog", i + 1));
        }
        System.out.println("Сохранили кошек и собак в animalsLinkedList:\n" + animalsLinkedList +
                "\n=========================================================================================================");

        for (int i = 0; i < animalsLinkedList.size(); i++) {
            if(animalsLinkedList.get(i) instanceof Cat) {
                catCount++;
                if(catCount % 5 == 0) {
                    animalsLinkedList.remove(animalsLinkedList.get(i));
                }
            }
        }
        System.out.println("Удалили каждую 5 кошку из animalsLinkedList:\n" + animalsLinkedList +
                "\n=========================================================================================================");

        for (int i = 0; i < animalsLinkedList.size(); i++) {
            if(animalsLinkedList.get(i) instanceof Dog) {
                dogCount++;
                if(dogCount % 3 == 0) {
                    mouseCount++;
                    animalsLinkedList.add(animalsLinkedList.indexOf(animalsLinkedList.get(i)) + 1,new Mouse("Mouse", mouseCount));
                }
            }
        } System.out.println("Вставили после каждой 3 собаки одну мышку в animalsLinkedList:\n" + animalsLinkedList +
                "\n=========================================================================================================");
        
        LinkedList<Object> besideCatMouseLinkedList = new LinkedList<>();
        
        for (int i = 0; i < animalsLinkedList.size(); i++) {
            for(int j = 0; j < animalsLinkedList.size(); j++) {
                if(animalsLinkedList.get(i) instanceof Cat && animalsLinkedList.get(j) instanceof Mouse) {
                    if(animalsLinkedList.indexOf(animalsLinkedList.get(i)) - animalsLinkedList.indexOf(animalsLinkedList.get(j)) == 1 ||
                            animalsLinkedList.indexOf(animalsLinkedList.get(i)) - animalsLinkedList.indexOf(animalsLinkedList.get(j)) == - 1) {
                        besideCatMouseLinkedList.add(animalsLinkedList.get(j));
                        besideCatMouseLinkedList.add(animalsLinkedList.get(i));
                    }
                } 
            } 
        } System.out.println("Переместили в новый LinkedList стоящих рядом кошек и мышек:\n" + besideCatMouseLinkedList +
                "\n=========================================================================================================");

        ArrayList<Object> animalsArrayList = new ArrayList<>(animalsLinkedList);
        System.out.println("Скопировали весь список животных в ArrayList:\n" + animalsArrayList +
                "\n=========================================================================================================");

        LinkedList<Object> sortAnimalsLinkedList = new LinkedList<>();
        int catSumAge = 0;
        int dogSumAge = 0;
        int mouseSumAge = 0;

        for (int i = 0; i < animalsArrayList.size(); i++) {
            if(animalsArrayList.get(i) instanceof Cat) {
                catSumAge = catSumAge + ((Cat)animalsLinkedList.get(i)).getAge();
                sortAnimalsLinkedList.add(0,  ((Cat)animalsLinkedList.get(i)));
            }
            if (animalsArrayList.get(i) instanceof Dog) {
                dogSumAge = dogSumAge + ((Dog)animalsLinkedList.get(i)).getAge();
                sortAnimalsLinkedList.add(sortAnimalsLinkedList.size(), ((Dog)animalsLinkedList.get(i)));
            }
            if(animalsArrayList.get(i) instanceof Mouse) {
                mouseSumAge =mouseSumAge + ((Mouse)animalsLinkedList.get(i)).getAge();
            }
        }

        for (int i = 0; i < sortAnimalsLinkedList.size(); i++) {
            if(animalsArrayList.get(i) instanceof Mouse) {
                sortAnimalsLinkedList.add(((Mouse)animalsLinkedList.get(i)));
            }
        }
        System.out.printf("""
                        Сумма возрастов кошек: %s\s
                        Сумма возраство собак: %s\s
                        Сумма возрастов мышей: %s
                        =========================================================================================================""",
                catSumAge, dogSumAge, mouseSumAge);

        System.out.println("\nРаспределили животных в новый LinkedList. Вначале кошки, посередине собаки и в конце мыши:\n" + sortAnimalsLinkedList);
    }
}
