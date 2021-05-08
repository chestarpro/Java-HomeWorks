package com.company.B;

public class Course {
    private String courseName;
    private String dateStart;
    private String id;
    private String fullNameTeacher;

    public Course(){}

    public Course(String courseName, String dateStart, String id, String fullNameTeacher) {
        this.courseName = courseName;
        this.dateStart = dateStart;
        this.id = id;
        this.fullNameTeacher = fullNameTeacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullNameTeacher() {
        return fullNameTeacher;
    }

    public void setFullNameTeacher(String fullNameTeacher) {
        this.fullNameTeacher = fullNameTeacher;
    }

    @Override
    public String toString() {
        return String.format("%s | Date start: %s | ID: %s | Teacher: %s ",
                this.courseName, this.dateStart, this.id, this.fullNameTeacher);
    }
}
