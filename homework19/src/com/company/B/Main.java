package com.company.B;


public class Main {
    public static void main(String[] args) {
        Student[] arrayStudent = new Student[2];
        arrayStudent[0] = new Student(
                "14.01.1993",
                "Sheraliev",
                "Chyngyz",
                "Man",
                28);

        arrayStudent[1] = new Student(
                "15.02.1996",
                "Eraliev",
                "Ilgiz",
                "Man",
                23);

        Course course = new Course("Java",
                "16.02.2021",
                "JV-W21",
                "Aidin Sabyrov");

        Group group = new Group(
                arrayStudent,
                course,
                "25.02.2021",
                10);

        Lessons lessons = new Lessons(
                "24.06.2021",
                arrayStudent, course,
                "19:00",
                false,
                true);
        System.out.println(lessons);
    }
}
