package com.company;

import com.company.dao.BaseDao;
import com.company.dao.CountryDao;
import com.company.dao.impl.CountryDaoImpl;

import java.sql.*;

public class TestC extends BaseDao {

    public static void main(String[] args) {
        CountryDao countryDao = new CountryDaoImpl();
        insert();
        System.out.println("Все города страны, названия которой начинается на <K>");
        countryDao.selectCityK();
        System.out.println("Общее количество человек в городах каждой страны: " + countryDao.getAllPeopleCount());

        countryDao.addLanguageColumn();

    }
    public static void insert() {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("insert into people(full_name, date_birth) \n" +
                     "values ('People1', '2000-01-01'), \n" +
                     "\t   ('People2', '2000-01-02'),\n" +
                     "\t   ('People3', '2000-01-03'),\n" +
                     "\t   ('People4', '2000-01-04'),\n" +
                     "\t   ('People5', '2000-01-05'),\n" +
                     "\t   ('People6', '2000-01-06'),\n" +
                     "\t   ('People7', '2000-01-07'),\n" +
                     "\t   ('People8', '2000-01-08'),\n" +
                     "\t   ('People9', '2000-01-09'),\n" +
                     "\t   ('People10', '2000-01-10');\n" +
                     "insert into country (name, code, population, president) \n" +
                     "values ('Kyrgyzstan', 996, 6000000, 1), ('Canada', 1, 6000000, 2);\n" +
                     "\n" +
                     "insert into city(name, country_id, population, mayor)\n" +
                     "values ('Bishkek', 1, 1000000, 3), ('Osh', 1, 1000000, 4), ('Ottawa', 2, 2000000, 5);")){
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
