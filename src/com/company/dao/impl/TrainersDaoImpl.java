package com.company.dao.impl;

import com.company.dao.BaseDao;
import com.company.dao.TrainersDao;
import com.company.model.Trainer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TrainersDaoImpl extends BaseDao implements TrainersDao {

    @Override
    public List<Trainer> getAll() {
        List<Trainer> trainers = null;
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement statement = null;

        try {
            connection = connect();
            statement = connection.prepareStatement("SELECT * FROM trainers");
            resultSet = statement.executeQuery();
            trainers = new ArrayList<>();

            while (resultSet.next()) {
                Trainer trainer = new Trainer();
                trainer.setId(resultSet.getInt("id"));
                trainer.setName(resultSet.getString("name"));
                trainer.setSurname(resultSet.getString("surname"));
                trainer.setSalary(resultSet.getInt("salary"));
                trainers.add(trainer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return trainers;
    }

    @Override
    public int getFinalSalary() {
        int finalSalary = 0;
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement statement = null;

        try {
            connection = connect();
            statement = connection.prepareStatement("SELECT t.salary FROM trainers t");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
               finalSalary += resultSet.getInt("salary");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return finalSalary;
    }

    @Override
    public List<String> getMolodec() {
        return null;
    }
}
