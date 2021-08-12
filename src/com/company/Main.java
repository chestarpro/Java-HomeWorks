package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Day, Integer> map = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            Day day = new Day();
            int date = new Random().nextInt(30 + 1 - 1) + 1;
            int idDayOfWeek = 0;

            for (int j = 0; j < date; j++) {
                if(idDayOfWeek == 7) {
                    idDayOfWeek = 0;
                }
                idDayOfWeek++;
            }
            printRandomDate(date);
            setDayOfWeek(day, idDayOfWeek);

            System.out.println(" it's " + day.getWeekDay());

            if(map.containsKey(day)) {
                map.put(day, map.get(day) + 1);
            }else {
                map.put(day, 1);
            }
        }

        System.out.println("__________________________");

        for (Map.Entry<Day, Integer> entry: map.entrySet()) {
            System.out.println(entry);
        }

    }

    public static void printRandomDate(int date) {
        switch (new Random().nextInt(12 + 1 - 1) + 1) {
            case 1 -> System.out.print(date + " january");
            case 2 -> System.out.print(date + " february");
            case 3 -> System.out.print(date + " march");
            case 4 -> System.out.print(date + " april");
            case 5 -> System.out.print(date + " may");
            case 6 -> System.out.print(date + " june");
            case 7 -> System.out.print(date + " july");
            case 8 -> System.out.print(date + " august");
            case 9 -> System.out.print(date + " september");
            case 10 -> System.out.print(date + " october");
            case 11 -> System.out.print(date + " november");
            case 12 -> System.out.print(date + " december");
        }
    }

    public static void setDayOfWeek(Day day, int idDayOfWeek) {
        if(WeekDays.MONDAY.getId() == idDayOfWeek)
            day.setWeekDay(WeekDays.MONDAY);

        else if (WeekDays.TUESDAY.getId() == idDayOfWeek)
            day.setWeekDay(WeekDays.TUESDAY);

        else if (WeekDays.WEDNESDAY.getId() == idDayOfWeek)
            day.setWeekDay(WeekDays.WEDNESDAY);

        else if (WeekDays.THURSDAY.getId() == idDayOfWeek)
            day.setWeekDay(WeekDays.THURSDAY);

        else if (WeekDays.FRIDAY.getId() == idDayOfWeek)
            day.setWeekDay(WeekDays.FRIDAY);

        else if (WeekDays.SUNDAY.getId() == idDayOfWeek)
            day.setWeekDay(WeekDays.SUNDAY);

        else if (WeekDays.SATURDAY.getId() == idDayOfWeek)
            day.setWeekDay(WeekDays.SATURDAY);
    }
}
