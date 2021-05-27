package com.company.A;

import java.util.Scanner;

public class Reference {
    private Village[]villages;
    private District[]districts;
    private City[]cities;

    public Reference(Village[] villages, District[] districts, City[] cities) {
        this.villages = villages;
        this.districts = districts;
        this.cities = cities;
    }

    public void searchByLeaderName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the leader's name: ");
        String temp = scanner.nextLine();
        int count = 0;
        for (Village village : villages) {
            if (temp.equals(village.getNameLeader())) {
                System.out.println(village);
                count++;
            }
        }
        for (District district : districts) {
            if (temp.equals(district.getNameLeader())) {
                System.out.println(district);
                count++;
            }
        }
        for (City city : cities) {
            if (temp.equals(city.getNameLeader())) {
                System.out.println(city);
                count++;
            }
        }
        if(count == 0) System.out.println("Null");
    }
}
