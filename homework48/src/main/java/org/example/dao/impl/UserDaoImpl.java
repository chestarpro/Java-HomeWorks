package org.example.dao.impl;

import org.example.config.BaseDao;
import org.example.dao.UserDao;
import org.example.model.UserModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    @Override
    public UserModel getByName(String name) {
        String sql = "SELECT * FROM users WHERE user_name = ?";
        ResultSet rs = null;
        try (PreparedStatement ps = BaseDao.connect().prepareStatement(sql)){
            ps.setString(1, name);
            rs = ps.executeQuery();

            if(rs.next()) {
                return new UserModel(
                        rs.getLong("id_user"),
                        rs.getString("user_name"),
                        rs.getString("user_password"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }
}
