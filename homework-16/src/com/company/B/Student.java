package com.company.B;

public class Student {
    private String dateBirthStudent;
    private String sureNameStudent;
    private String nameStudent;
    private String genderStudent;
    private int ageStudent;

    public Student () {

    }

    public Student(String dateBirthStudent, String sureNameStudent, String nameStudent, String genderStudent, int ageStudent) {
        this.dateBirthStudent = dateBirthStudent;
        this.sureNameStudent = sureNameStudent;
        this.nameStudent = nameStudent;
        this.genderStudent = genderStudent;
        this.ageStudent = ageStudent;
    }

    public String getDateBirthStudent() {
        return dateBirthStudent;
    }

    public void setDateBirthStudent(String dateBirthStudent) {
        this.dateBirthStudent = dateBirthStudent;
    }

    public String getSureNameStudent() {
        return sureNameStudent;
    }

    public void setSureNameStudent(String sureNameStudent) {
        this.sureNameStudent = sureNameStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getGenderStudent() {
        return genderStudent;
    }

    public void setGenderStudent(String genderStudent) {
        this.genderStudent = genderStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }
}
