package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

    public static Connection getMySQLConnection()
            throws SQLException {
        String url ="jdbc:mysql://localhost:3306/tp_jdbc?useSSL=false";
        Connection connection = DriverManager.getConnection(url,"root","");
        return connection;
    }
}
