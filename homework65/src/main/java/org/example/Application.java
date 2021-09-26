package org.example;

import org.example.entity.Championship;
import org.example.entity.Country;
import org.example.entity.KindOfSport;
import org.example.entity.Team;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class Application {
    public static void main(String[] args) {
        Country kyrgyzstan = saveEntity(Country.builder().name("Kyrgyzstan").build());
        KindOfSport football = saveEntity(KindOfSport.builder().name("Football").build());

        Team iTAcademyJava = saveEntity(
                Team.builder()
                        .name("IT-Academy Java")
                        .logo("https://github.com/chestarpro/images/blob/main/it-academy-java.png")
                        .webSite("http://itacademy.tilda.ws/java")
                        .country(kyrgyzstan)
                        .kindOfSport(football)
                        .build());

        Team iTAcademyPython = saveEntity(
                Team.builder()
                        .name("IT-Academy Python")
                        .logo("https://github.com/chestarpro/images/blob/main/it-academy-python.png")
                        .webSite("http://itacademy.tilda.ws/python")
                        .country(kyrgyzstan)
                        .kindOfSport(football)
                        .build());

        Championship championship = saveEntity(
                Championship.builder()
                        .country(kyrgyzstan)
                        .name("IT-Academy football championship")
                        .kindOfSport(football)
                        .build());

        System.out.println(iTAcademyJava);
        System.out.println(iTAcademyPython);
        System.out.println(championship);
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