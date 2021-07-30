package com.company.dao.impl;

import com.company.dao.BaseDao;
import com.company.dao.UserDao;
import com.company.model.UserLogModel;
import com.company.model.UserModel;

import java.sql.*;
import java.util.Date;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public UserModel createUser(UserModel userModel) {
        String sql = "INSERT INTO users(login, email, password, date_of_registration)" +
                "VALUES(?, ?, ?, ?)";

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
            ps.setTimestamp(4, userModel.getDateOfRegistration());

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
        String sql = "SELECT id, login, email, password, date_of_registration " +
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
    public UserModel getByEmail(String userEmail) {
        String sql = "SELECT id, login, email, password, date_of_registration " +
                "FROM users WHERE email = ?";

        ResultSet resultSet = null;

        try (Connection connection = connect();
        PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, userEmail);
            resultSet = ps.executeQuery();

            if(resultSet.next()) {
                UserModel user = new UserModel();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("login"));
                user.setLogin(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
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
    public void writeLog(UserLogModel userLog) {
        String sql = "INSERT INTO users_logs(is_success, user_id, time_log) " +
                "VALUES(?, ?, ?)";

        try(Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement(sql)) {
            Date date = new Date();
            userLog.setTimLog(new Timestamp(date.getTime()));
            ps.setBoolean(1, userLog.getSuccess());
            ps.setInt(2, userLog.getUserId());
            ps.setTimestamp(3, userLog.getTimLog());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public int getCountFalseLog(int id) {
        String sql = "SELECT is_success FROM users_logs \n" +
                "WHERE is_success = false and user_id = ?;";

        ResultSet resultSet = null;
        int count = 0;
        try(Connection connection = connect();
        PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return count;
    }

    @Override
    public void deleteFalseLog(int id) {
        String sql = "DELETE FROM users_logs \n" +
                "WHERE is_success = false AND\n" +
                "user_id = ?";

        try(Connection connection = connect();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public Timestamp getLastFalseLogTime() {
        String sql = "select time_log from users_logs " +
                "where id = (select max(id) from users_logs) and is_success = false";
        ResultSet resultSet = null;
        Timestamp timestamp= null;
        try(Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement(sql)) {
            resultSet = ps.executeQuery();
            if(resultSet.next()) {
                timestamp = resultSet.getTimestamp("time_log");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return timestamp;
    }
}
