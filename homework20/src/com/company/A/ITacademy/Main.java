package com.company.A.ITacademy;


public class Main {
    public static void main(String[] args) {
        com.company.A.ITacademy.Student[] arrayStudent = new com.company.A.ITacademy.Student[2];
        arrayStudent[0] = new com.company.A.ITacademy.Student(
                "14.01.1993",
                "Sheraliev",
                "Chyngyz",
                "Man",
                28);

        arrayStudent[1] = new com.company.A.ITacademy.Student(
                "15.02.1996",
                "Eraliev",
                "Ilgiz",
                "Man",
                23);

        com.company.A.ITacademy.Course course = new com.company.A.ITacademy.Course("Java",
                "16.02.2021",
                "JV-W21",
                "Aidin Sabyrov");

        com.company.A.ITacademy.Group group = new com.company.A.ITacademy.Group(
                arrayStudent,
                course,
                "25.02.2021",
                10);

        com.company.A.ITacademy.Lessons lessons = new com.company.A.ITacademy.Lessons(
                "24.06.2021",
                arrayStudent, course,
                "19:00",
                false,
                true);
        System.out.println(lessons);
    }
}