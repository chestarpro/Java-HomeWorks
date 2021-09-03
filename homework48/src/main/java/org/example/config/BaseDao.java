package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class BaseDao {
    private static final String url = "jdbc:postgresql://localhost:5432/";
    private static final String user = "postgres";
    private static final String password = "postgres";

    public static Connection connect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(url, user, password);
    }
}
