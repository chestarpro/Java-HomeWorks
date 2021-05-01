package com.company.B;

public class Group {
     private Student[] arrayStudent;
     private Course course;
     private String dateStart;
     private int monthPeriod;



    public Student[] getArrayStudent() {
        return arrayStudent;
    }

    public void setArrayStudent(Student[] arrayStudent) {
        if(arrayStudent == null) System.out.println("error");
        else this.arrayStudent = arrayStudent;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public int getMonthPeriod() {
        return monthPeriod;
    }

    public void setMonthPeriod(int monthPeriod) {
        this.monthPeriod = monthPeriod;
    }
    public void printArrayStudent(Student[] student) {
        for (Student i : student) {
            if (i.getAgeStudent() < 0) { //Проверка на негативное число
                System.out.println("Date of birth:  " + i.getDateBirthStudent() +
                        "\nSurname: " + i.getSureNameStudent() +
                        "\nName: " + i.getNameStudent() +
                        "\nGender: " + i.getGenderStudent() +
                        "\nAge: Error" +
                        "\n--------------------");
            } else System.out.println("Date of birth:  " + i.getDateBirthStudent() +
                               "\nSurname: " + i.getSureNameStudent() +
                               "\nName: " + i.getNameStudent() +
                               "\nGender: " + i.getGenderStudent() +
                               "\nAge: " + i.getAgeStudent() +
                               "\n--------------------");
        }
    }
    public void printCourse(Course course) {
        System.out.println("Course name: " + course.getCourseName() +
                           "\nDate start: " + course.getDateStart() +
                           "\nID: " + course.getId() +
                           "\nFull name teacher: " + course.getFullNameTeacher() +
                           "\n--------------------");
    }
}

