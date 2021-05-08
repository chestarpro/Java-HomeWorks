package com.company.B;

import java.util.Arrays;

public class Group {
    private Student[] arrayStudent;
    private Course course;
    private String dateStart;
    private int monthPeriod;

    public Group(){}

    public Group(String dateStart, Student[]arrayStudent, Course course) {
        this.dateStart = dateStart;
        this.arrayStudent = arrayStudent;
        this.course = course;
    }

    public Group(Student[] arrayStudent, Course course, String dateStart, int monthPeriod) {
        this.arrayStudent = arrayStudent;
        this.course = course;
        this.dateStart = dateStart;
        this.monthPeriod = monthPeriod;
    }

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

    public String removeBrackets(String str) {
        return str.substring(1, str.length() -1);
    }

    @Override
    public String toString() {
        return String.format("""
                        Student: %s\s
                        Course: %s \s
                        Date of creation: %s \s
                        Duration in months: %s""",
                removeBrackets(Arrays.toString(this.arrayStudent)),
                this.course,
                this.dateStart,
                this.monthPeriod);
    }
}
