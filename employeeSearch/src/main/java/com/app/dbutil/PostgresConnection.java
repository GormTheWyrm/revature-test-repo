package com.app.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {

    private PostgresConnection(){}
    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://localhost:5432/postgres";
            String username="postgres";
            String password="password";
            connection= DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
    public static Connection getConnection(){
        return connection;
    }

}


/*
How to build SingleTon Java class?
Disable the constructor by making it as private
keep a static method which checks and return the instance of the Connection object.
 */