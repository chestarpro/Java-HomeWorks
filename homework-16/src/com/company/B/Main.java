package com.company.B;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setDateBirthStudent("14.01.1993");
        student1.setSureNameStudent("Sheraly uulu");
        student1.setNameStudent("Chyngyz");
        student1.setGenderStudent("Man");
        student1.setAgeStudent(28);

        Student student2 = new Student();
        student2.setDateBirthStudent("21.12.2002");
        student2.setSureNameStudent("Uasiliev");
        student2.setNameStudent("Uasya");
        student2.setGenderStudent("Man");
        student2.setAgeStudent(19);

        Student[] arrayStudent = new Student[2];
        arrayStudent[0] = student1;
        arrayStudent[1] = student2;

        Course course = new Course();
        course.setCourseName("Java");
        course.setDateStart("16.02.2021");
        course.setId("JV-W21");
        course.setFullNameTeacher("Aidin Sabyrov"); //:)

        Group group = new Group();
        group.setArrayStudent(arrayStudent);
        group.setCourse(course);
        group.setDateStart("24.02.2021");
        group.setMonthPeriod(10);

        group.printArrayStudent(group.getArrayStudent());
        group.printCourse(group.getCourse());
        System.out.println("Date of creation : " + group.getDateStart() +
                           "\nDuration in months: " + group.getMonthPeriod());
    }
}
