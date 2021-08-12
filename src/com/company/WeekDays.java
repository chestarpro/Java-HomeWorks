package com.company;

public enum WeekDays {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int id;
    WeekDays(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
