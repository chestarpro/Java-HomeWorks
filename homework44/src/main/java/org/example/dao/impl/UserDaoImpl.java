package org.example.dao.impl;

import org.example.dao.BaseDao;
import org.example.dao.UserDao;
import org.example.model.UserModel;

import java.sql.*;
import java.util.Date;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public UserModel createUser(UserModel userModel) {
        String sql = "INSERT INTO users(login, email, password, gender, date_of_registration)" +
                "VALUES(?, ?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            Date date = new Date();
            userModel.setDateOfRegistration(new Timestamp(date.getTime()));
            connection = connect();
            ps = connection
                    .prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, userModel.getLogin());
            ps.setString(2, userModel.getEmail());
            ps.setString(3, userModel.getPassword());
            ps.setString(4, userModel.getGender());
            ps.setTimestamp(5, userModel.getDateOfRegistration());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();
            if (resultSet.next()) {
                userModel.setId(resultSet.getInt(1));
            }
            return userModel;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (ps != null)
                    ps.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    @Override
    public UserModel getByUsername(String username) {
        String sql = "SELECT id, login, email, password, gender, date_of_registration " +
                "FROM users WHERE login = ?";

        ResultSet resultSet = null;
        try (Connection connection = connect();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, username);
            resultSet = ps.executeQuery();

            if (resultSet.next()) {
                UserModel user = new UserModel();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
                user.setGender(resultSet.getString("gender"));
                user.setDateOfRegistration(resultSet.getTimestamp("date_of_registration"));
                return user;
            }
            return null;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public UserModel getByUserEmail(String userEmail) {
        String sql = "SELECT id, login, email, password, gender, date_of_registration " +
                "FROM users WHERE email = ?";

        ResultSet resultSet = null;
        try (Connection connection = connect();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, userEmail);
            resultSet = ps.executeQuery();

            if (resultSet.next()) {
                UserModel user = new UserModel();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
                user.setGender(resultSet.getString("gender"));
                user.setDateOfRegistration(resultSet.getTimestamp("date_of_registration"));
                return user;
            }
            return null;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }
}
