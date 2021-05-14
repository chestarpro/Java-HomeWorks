package com.company;

import com.company.Restaurant.Client;
import com.company.Restaurant.Cook;
import com.company.Restaurant.Security;
import com.company.Restaurant.Waiter;

public class Main {

    public static void main(String[] args) {
        Cook cook = new Cook("Поварбай", 45, "Asanbay 3", "Man", "Cook",
                45000, "10 years", "Pizza, Risotto, Tiramisu",
                "Organization of services in public catering", "Best Chef Award 2021");
        System.out.println(cook);
        cook.goToWork();
        cook.toBeLate(); // за опоздание штраф вычитается из зарпалты
        cook.goGroceryShopping();
        cook.inventDishes("Жаренные манты");
        cook.cookTheDish();
        cook.goOnVacation();
        System.out.println();
//--------------------------------------------------------------------------------------------------------------------//
        Waiter waiter1 = new Waiter("Официантбек", 20, "12 micro-district, 2",
                "Man", "Waiter", 30000, "1 yer");
        System.out.println(waiter1);
        waiter1.goToWork();
        waiter1.toBeLate();
        waiter1.acceptTheOrder();
        waiter1.deliverTheOrder();
        waiter1.calculate();
        System.out.println();

        Waiter waiter2 = new Waiter("Официанткагуль", 19, "8 micro-district, 14",
                "Woman", "Waiter", 30000, "2 yer");
        System.out.println(waiter2);
        waiter2.goOnVacation();
        System.out.println();

        Waiter waiter3 = new Waiter("Официантжан", 21, "7 micro-district, 43",
                "Man", "Waiter", 32000, "5 yer");
        System.out.println(waiter3);
        waiter3.goOnVacation();
        System.out.println();
//--------------------------------------------------------------------------------------------------------------------//
        Security security = new Security("Охранникбек", 52, "5 micro-district, 36",
                "Man", "Security", 32000, "4 yer",
                true);
        System.out.println(security);
        security.goToWork();
        security.toBeLate();
        System.out.println();
//--------------------------------------------------------------------------------------------------------------------//
        Client client1 = new Client("Pink", 18, "3 micro-district, 11",
                "Woman", true, 3500, true);
        security.faceControl(client1.getName(), client1.getFaceControlPass());//  <-- Face control
        System.out.println(client1);
        client1.callTheWaiter();
        client1.toOrder();
        client1.toPay();

        Client client2 = new Client("Blonde", 21, "9 micro-district, 11",
                "Woman", false, 0, false);
        security.faceControl(client2.getName(), client2.getFaceControlPass());//  <-- Face control
        System.out.println(client2);

        Client client3 = new Client("Orange", 22, "3 micro-district, 11",
                "Woman", true, 800, false);
        security.faceControl(client3.getName(), client3.getFaceControlPass());//  <-- Face control
        System.out.println(client3);

        Client client4 = new Client("White", 20, "3 micro-district, 11",
                "Woman", false, 4500, true);
        security.faceControl(client4.getName(), client4.getFaceControlPass());//  <-- Face control
        System.out.println(client4);

        Client client5 = new Client("Blue", 19, "3 micro-district, 11",
                "Woman", true, 1250, true);
        security.faceControl(client5.getName(), client5.getFaceControlPass());//  <-- Face control
        System.out.println(client5);

        Client client6 = new Client("Brown", 25, "3 micro-district, 11",
                "Woman", true, 6520, true);
        security.faceControl(client6.getName(), client6.getFaceControlPass());//  <-- Face control
        System.out.println(client6);
//--------------------------------------------------------------------------------------------------------------------//
        security.kickPeopleOut(); // Выгнать людей!
    }
}
