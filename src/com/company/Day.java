package com.company;

import java.util.Objects;

public class Day {
    private WeekDays weekDay;

    public Day() {
    }

    public Day(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    public WeekDays getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    @Override
    public int hashCode() {

//        return Objects.hash(weekDay);

        return 1; // При заполнении воспроизвести коллизию.
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if (!(obj instanceof Day)) return false;

        Day day = (Day) obj;
        return this.weekDay.equals(day.weekDay);
    }

    @Override
    public String toString() {
        return String.format("Day of week : %s", this.weekDay);
    }
}
