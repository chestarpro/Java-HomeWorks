package com.company.dao.impl;

import com.company.dao.BaseDao;
import com.company.dao.CountryDao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CountryDaoImpl extends BaseDao implements CountryDao {

    @Override
    public void selectCityK() {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("select c2.\"name\" from country c \n" +
                     "join city c2 on c.id = c2.country_id \n" +
                     "where c.\"name\" like '%K%'");
             ResultSet resultSet = statement.executeQuery();) {

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getAllPeopleCount() {
        int countAllCityPeople = 0;
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("select c2.population from country c \n" +
                     "join city c2 on c.id = c2.country_id");
             ResultSet resultSet = statement.executeQuery();) {

            while (resultSet.next()) {
                countAllCityPeople += resultSet.getInt("population");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return countAllCityPeople;
    }

    @Override
    public void addLanguageColumn() {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("ALTER TABLE public.country " +
                     "ADD COLUMN language VARCHAR");) {
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
