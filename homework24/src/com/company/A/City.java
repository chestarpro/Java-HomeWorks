package com.company.A;

import java.util.Scanner;

public class City extends Locality {
    private District[] districts;

    public City() {
    }

    public City(String nameLocality, String nameLeader, District[] districts) {
        super(nameLocality, nameLeader);
        this.districts = districts;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

        public String searchDistrict() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя главы района: ");
        String temp = scanner.nextLine();
        for (District district : districts) {
            if (temp.equals(district.getNameLeader())) {
                return district.getNameLocality();
            }
        }
        return "Не найдено";
    }

    @Override
    public String toString() {
        return String.format("Мэр города %s, %s", getNameLocality(), getNameLeader());
    }
}