package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBdd {

    public  static Connection getMySQLConnection() throws SQLException {
        String url ="jdbc:mysql://localhost:3306/tpjdbc?useSSL=false";

        Connection connection= DriverManager.getConnection(url,"root","");

        return  connection;
    };
}
