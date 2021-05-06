package org.demo;

import java.sql.*;
public class Play {
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
            String sql="INSERT INTO employee_schema.employee (name, age, contact, city, gender, deptid) VALUES('Dickie', 14, 2114417140, 'Baltimore', 'M', 200); ";
//            String sql="INSERT INTO employee_schema.employee (name, age, contact, city, gender, deptid) VALUES(?, ?, ?, ?, ?); ";
            //Step 4 - Execute Query
//            ResultSet resultSet=statement.executeQuery(sql); //only for select
            int executeUpdate=statement.executeUpdate(sql);
//            (sql);
            System.out.println("Query executed");

            //Step 5 - Process Results
//            while (resultSet.next()){
//                System.out.print("Id : "+resultSet.getInt("id"));
//                System.out.print(" Name : "+resultSet.getString("name"));
//                System.out.print(" City : "+resultSet.getString("city"));
//                System.out.print(" Gender : "+resultSet.getString("gender"));
//                System.out.print(" Age : "+resultSet.getInt("age"));
//                System.out.println(" Contact : "+resultSet.getLong("contact"));
//            }

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
