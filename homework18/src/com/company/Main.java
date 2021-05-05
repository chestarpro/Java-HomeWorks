package com.company;

public class Main {

    public static void main(String[] args) {
        Cow[] arrayCowFarm1 = new Cow[5];
        arrayCowFarm1[0] = new Cow(481.5, 8, "female", "myExGirlfriend1"); // azaza XD
        arrayCowFarm1[1] = new Cow(800.8, 9, "male", "Torpedo");
        arrayCowFarm1[2] = new Cow(400.4, 7, "female", "myExGirlfriend2");
        arrayCowFarm1[3] = new Cow(445.8, 10, "female", "myExGirlfriend3");
        arrayCowFarm1[4] = new Cow(478.9, 11, "female", "myExGirlfriend4");

        Sheep[] arraySheepFarm1 = new Sheep[3];
        arraySheepFarm1[0] = new Sheep(68.5, 5,"female", "myExGirlfriend5");
        arraySheepFarm1[1] = new Sheep(70.7, 6,"female", "myExGirlfriend6");
        arraySheepFarm1[2] = new Sheep(89.9, 7, "male", "myBestFriend");

        Horse[] arrayHorseFarm1 = new Horse[2];
        arrayHorseFarm1[0] = new Horse(650.9, 15, "male", "Mustang");
        arrayHorseFarm1[1] = new Horse(400.3, 7, "female", "Porsche");

        Farm farm1 = new Farm("Jailoo №-1, Chui area, Kyrgyzstan", arrayCowFarm1, arraySheepFarm1,
                arrayHorseFarm1, "Malsatarov Malsatar Malsatarovich");

        System.out.println("Farm №-1 " + farm1);
//--------------------------------------------------------------------------------------------------------------------//
        Cow[] arrayCowFarm2 = new Cow[1];
        arrayCowFarm2[0] = new Cow(501.5, 9, "female", "myExGirlfriend7");

        Sheep[] arraySheepFarm2 = new Sheep[1];
        arraySheepFarm2[0] = new Sheep(70.2, 4,"female", "myExGirlfriend8");

        Horse[] arrayHorseFarm2 = new Horse[1];
        arrayHorseFarm2[0] = new Horse(559.3, 10, "male", "Kandai-Aigyrdai");

        Farm farm2 = new Farm("Jailoo №-2, Jalal-Аbad area, Kyrgyzstan", arrayCowFarm2, arraySheepFarm2,
                arrayHorseFarm2, "Malbagarov Malbagar Malbagarovich");

        System.out.println("Farm №-2 " + farm2);
    }
}
