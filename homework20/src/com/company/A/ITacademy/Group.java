package com.company.A.ITacademy;

import java.util.Arrays;

public class Group {
    private com.company.A.ITacademy.Student[] arrayStudent;
    private com.company.A.ITacademy.Course course;
    private String dateStart;
    private int monthPeriod;

    public Group(){}

    public Group(String dateStart, com.company.A.ITacademy.Student[]arrayStudent, com.company.A.ITacademy.Course course) {
        this.dateStart = dateStart;
        this.arrayStudent = arrayStudent;
        this.course = course;
    }

    public Group(com.company.A.ITacademy.Student[] arrayStudent, com.company.A.ITacademy.Course course, String dateStart, int monthPeriod) {
        this.arrayStudent = arrayStudent;
        this.course = course;
        this.dateStart = dateStart;
        this.monthPeriod = monthPeriod;
    }

    public com.company.A.ITacademy.Student[] getArrayStudent() {
        return arrayStudent;
    }

    public void setArrayStudent(com.company.A.ITacademy.Student[] arrayStudent) {
        if(arrayStudent == null) System.out.println("error");
        else this.arrayStudent = arrayStudent;
    }

    public com.company.A.ITacademy.Course getCourse() {
        return course;
    }

    public void setCourse(com.company.A.ITacademy.Course course) {
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