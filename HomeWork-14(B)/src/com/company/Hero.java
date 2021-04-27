package com.company;

public class Hero {
    String name; //Имя
    String nickName; //Титул(Прозвище)
    String race; //Расса(Ор, Человек, Эльф)
    String gender; //Пол
    String abilities; //Способность героя
    int hp; //Запас здоровья
    String attackType; //Ближний/Дальний бой
    int damageStrength; //Сила урона
    int speed; //Скорость передвижения героя
    String typeMana; //Тип магии
    double mana; //Запас магии:)
    boolean isFly; //Умеет ли литать?

     public void getInfo() {
        System.out.println("---------------------------\n" +
                            "Hero name: " + name +
                            "\nNickname: " + nickName +
                            "\nRace: " + race +
                            "\nGender: " + gender +
                            "\nAbilities: " + abilities +
                            "\nHealth reserve: " + hp +
                            "\nAttack type : " + attackType +
                            "\nDamage Strength: " + damageStrength +
                            "\nSpeed: " + speed +
                            "\nMagic type: " + typeMana +
                            "\nStock of magic: " + mana);
        if(isFly) {
            System.out.println("Can fly");
        } else System.out.println("Can't fly");
    }
}
