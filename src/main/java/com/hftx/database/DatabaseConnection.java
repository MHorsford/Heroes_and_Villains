package com.hftx.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connection() throws SQLException{
        String url = "com/hftx/database/scripts/system.db";
        Connection conn = null;
        try {
            DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.printf(e.getMessage());
        }
        return conn;
    }
}
