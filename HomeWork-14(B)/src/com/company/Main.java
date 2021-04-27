package com.company;

public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero();
        Hero hero2 = new Hero();
        Hero hero3 = new Hero();

        hero1.name = "Illidan Stormrage";
        hero1.nickName = "Traitor";
        hero1.race = "Hybrid, Night Elf/Demon";
        hero1.gender = "Man";
        hero1.abilities = "Sorcerer/Dexterous";
        hero1.hp = 1200;
        hero1.attackType = "Melee";
        hero1.damageStrength = 70;
        hero1.speed = 25;
        hero1.typeMana = "Stealing souls";
        hero1.mana = 300;
        hero1.isFly = true;

        hero2.name = "Thrall";
        hero2.nickName = "Great Shaman";
        hero2.race = "Orc";
        hero2.gender = "Man";
        hero2.abilities = "Sorcerer";
        hero2.hp = 800;
        hero2.attackType = "Distant";
        hero2.damageStrength = 50;
        hero2.speed = 20;
        hero2.typeMana = "Thunder/lightning";
        hero2.mana = 500;
        hero2.isFly = false;

        hero3.name = "Arthas Menethil";
        hero3.nickName = "Hero Paladin";
        hero3.race = "Human";
        hero3.gender = "Man";
        hero3.abilities = "Strength";
        hero3.hp = 1000;
        hero3.attackType = "Melee";
        hero3.damageStrength = 100;
        hero3.speed = 18;
        hero3.typeMana = "Resurrect allies";
        hero3.mana = 300;
        hero3.isFly = false;

        hero1.getInfo();
        hero2.getInfo();
        hero3.getInfo();
    }
}
