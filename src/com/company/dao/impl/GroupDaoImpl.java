package com.company.dao.impl;

import com.company.dao.BaseDao;
import com.company.dao.GroupDao;
import com.company.model.Group;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class GroupDaoImpl extends BaseDao implements GroupDao {
    @Override
    public List<Group> getAllGroup() {
        List<Group> groups = null;
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement statement = null;

        try {
            connection = connect();
            statement = connection.prepareStatement("SELECT * FROM  group_students\n");
            resultSet = statement.executeQuery();
            groups = new ArrayList<>();

            while (resultSet.next()) {
                Group group = new Group();
                group.setId(resultSet.getInt("id"));
                group.setName(resultSet.getString("name"));

                groups.add(group);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return groups;
    }

    @Override
    public void getCountStudents(String nameGroup) {
        int count = 0;
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement statement = null;

        try {
            connection = connect();
            statement = connection.prepareStatement("SELECT s.fio FROM group_students gs\n" +
                    "JOIN students s ON gs.id = s.group_id\n" +
                    "where gs.\"name\" = '"+ nameGroup + "';\n");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                count++;
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
        System.out.println("В группе " + nameGroup + " " + count + " студентов");
    }
}
