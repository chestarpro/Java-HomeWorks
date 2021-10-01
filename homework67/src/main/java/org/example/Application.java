package org.example;

import org.example.entity.Championship;
import org.example.entity.Country;
import org.example.entity.KindOfSport;
import org.example.entity.Team;
import org.example.util.HibernateUtil;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static final String BARCELONA_LOGO = "https://www.clipartmax.com/middle/m2H7K9K9G6N4A0Z5_fc-barcelona-png-logo-barcelona-football-logo-png/";
    public static final String REAL_MADRID_LOGO = "https://www.clipartmax.com/middle/m2i8i8G6Z5G6m2b1_realmadrid-cliparts-real-madrid-logo/";
    public static final String MILAN_LOGO = "https://www.clipartmax.com/middle/m2i8Z5i8Z5H7H7G6_file-escudo-ac-milan-1946-svg-wikimedia-commons-rh-dream-league-soccer/";
    public static final String JUVENTUS_LOGO = "https://www.clipartmax.com/middle/m2i8H7i8K9H7d3d3_wvu-logo-clipart-logo-juventus-98-png/";
    public static final String BULLS_LOGO = "https://www.clipartmax.com/middle/m2i8i8d3b1b1A0K9_san-antonio-spurs-basketball-chicago-bulls-logo/";
    public static final String NEW_YORK_KNICKS_LOGO = "https://www.clipartmax.com/middle/m2i8i8d3b1i8Z5G6_home-about-new-york-knicks/";

    public static void main(String[] args) {
        Country usa = saveEntity(Country.builder().name("USA").build());
        Country italy = saveEntity(Country.builder().name("Italy").build());
        Country spain = saveEntity(Country.builder().name("Spain").build());

        KindOfSport football = saveEntity(KindOfSport.builder().name("Football").build());
        KindOfSport basketball = saveEntity(KindOfSport.builder().name("Basketball").build());

        Championship euroChampionship = saveEntity(
                Championship.builder()
                        .country(italy)
                        .name("Italy football championship")
                        .kindOfSport(football)
                        .build());

        Championship worldChampionship = saveEntity(
                Championship.builder()
                        .country(spain)
                        .name("Spain football championship")
                        .kindOfSport(football)
                        .build());

        Championship usaChampionship = saveEntity(
                Championship.builder()
                        .country(usa)
                        .name("USA basketball championship")
                        .kindOfSport(basketball)
                        .build());

        Team barcelona = saveEntity(
                Team.builder()
                        .name("Barcelona")
                        .logo(BARCELONA_LOGO)
                        .website("https://www.fcbarcelona.com/")
                        .kindOfSport(football)
                        .country(spain)
                        .build());

        Team realMadrid = saveEntity(
                Team.builder()
                        .name("Real Madrid")
                        .logo(REAL_MADRID_LOGO)
                        .website("https://www.realmadrid.com/")
                        .kindOfSport(football)
                        .country(spain)
                        .build());

        Team juventus = saveEntity(
                Team.builder()
                        .name("Juventus")
                        .logo(JUVENTUS_LOGO)
                        .website("https://www.juventus.com/")
                        .kindOfSport(football)
                        .country(italy)
                        .build());

        Team milan = saveEntity(
                Team.builder()
                        .name("Milan")
                        .logo(MILAN_LOGO)
                        .website("https://www.acmilan.com")
                        .kindOfSport(football)
                        .country(italy)
                        .build());

        Team newYorkKnicks = saveEntity(
                Team.builder()
                        .name("New York Knicks")
                        .logo(NEW_YORK_KNICKS_LOGO)
                        .website("https://www.nba.com/knicks/")
                        .kindOfSport(basketball)
                        .country(usa)
                        .build());

        Team chicagoBulls = saveEntity(
                Team.builder()
                        .name("Chicago Bulls")
                        .logo(BULLS_LOGO)
                        .website("https://www.nba.com/bulls/")
                        .kindOfSport(basketball)
                        .country(usa)
                        .build());

        System.out.println("=========================================================");

        System.out.println(getChampionshipByName("USA basketball championship"));

        System.out.println("=========================================================");

        getAllTeamNameAndWebsite().forEach(i -> System.out.println(Arrays.toString(i)));

        System.out.println("=========================================================");

        getAllTeamItalyChampionship().forEach(System.out::println);
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

    public static Championship getChampionshipByName(String name) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            Championship championships = session.createQuery(
                            "FROM Championship c where upper(c.name) = upper(:name)", Championship.class)
                    .setParameter("name", name).uniqueResult();
            session.close();
            return championships;
        } catch (NonUniqueResultException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static List<Team> getAllTeamItalyChampionship() { // Ну в принципе в чемпионате Италии могут участвовать только команды с Италии :)
        Session session =
                HibernateUtil.getSessionFactory().openSession();
        List<Team> teams = session.createQuery(
                "from Team where country.name = 'Italy' order by kindOfSport", Team.class).list();
        session.close();
        return teams;
    }

    public static List<Object[]> getAllTeamNameAndWebsite() {
        Session session =
                HibernateUtil.getSessionFactory().openSession();
        List<Object[]> teams = session.createQuery(
                "select t.name, t.website from Team t order by t.id", Object[].class).setMaxResults(5).list();
        session.close();
        return teams;
    }
}