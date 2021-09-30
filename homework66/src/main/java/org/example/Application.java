package org.example;

import org.example.entity.Course;
import org.example.entity.Group;
import org.example.entity.Mentor;
import org.example.entity.Student;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Course java = saveEntity(Course.builder().name("Java").build());
        Course cSharp = saveEntity(Course.builder().name("C#").build());

        Mentor mentor1 = saveEntity(Mentor.builder().fullName("Shamil Satarov").build());
        Mentor mentor2 = saveEntity(Mentor.builder().fullName("Aidin Sabyrov").build());
        Mentor mentor3 = saveEntity(Mentor.builder().fullName("Alim Bogomolets").build());

        Group jvw21 = saveEntity(Group.builder().name("JV-W21").course(java).mentor(mentor1).build());
        Group jva21 = saveEntity(Group.builder().name("JV-A21").course(java).mentor(mentor2).build());
        Group csw20 = saveEntity(Group.builder().name("C#-A20").course(cSharp).mentor(mentor3).build());
        Group csw21 = saveEntity(Group.builder().name("C#-A21").course(cSharp).mentor(mentor3).build());

        Student student1 = saveEntity(new Student("student1", List.of(jvw21)));
        Student student2 = saveEntity(new Student("student2", List.of(jvw21)));
        Student student3 = saveEntity(new Student("student3", List.of(jvw21)));
        Student student4 = saveEntity(new Student("student4", Arrays.asList(jvw21, csw21)));
        Student student5 = saveEntity(new Student("student5", Arrays.asList(jvw21, csw21)));
        Student student6 = saveEntity(new Student("student6", List.of(jva21)));
        Student student7 = saveEntity(new Student("student7", List.of(jva21)));
        Student student8 = saveEntity(new Student("student8", List.of(jva21)));
        Student student9 = saveEntity(new Student("student9", Arrays.asList(jva21, csw21)));
        Student student10 = saveEntity(new Student("student10", Arrays.asList(jva21, csw21)));
        Student student11 = saveEntity(new Student("student11", Arrays.asList(csw21, jva21)));
        Student student12 = saveEntity(new Student("student12", Arrays.asList(csw21, jva21)));
        Student student13 = saveEntity(new Student("student13", List.of(csw21)));
        Student student14 = saveEntity(new Student("student14", List.of(csw21)));
        Student student15 = saveEntity(new Student("student15", List.of(csw21)));
    }

    public static <T> T saveEntity(T entity) {
        Session session =
                HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
        return entity;
    }
 }