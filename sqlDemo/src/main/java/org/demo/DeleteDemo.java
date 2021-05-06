package org.demo;

import java.sql.*;

public class DeleteDemo {

    public static void main(String[] args) {

        Connection connection=null;
        try {
            //Step 1 - Load Driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded");

            //Step2 - Open Connection
            String url="jdbc:postgresql://localhost:5432/postgres";
            String username="postgres";
            String password="password";
            connection= DriverManager.getConnection(url,username,password);
            System.out.println("Connection/Ping Success");

            //Step 3- Create Statement
            Statement statement=connection.createStatement();
            String sql= "delete from employee_schema.employee where city = ?;";

            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, "wally");



            //Step 4 - Execute Query
            int executeUpdate=preparedStatement.executeUpdate();    //query passed in line 24

            System.out.println("Query executed");

            //Step 5 - Process Results
            System.out.println("DELETED "+ executeUpdate + " RECORDS");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }finally {
            try {
                //Step 6 - Cloe Connection
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}
