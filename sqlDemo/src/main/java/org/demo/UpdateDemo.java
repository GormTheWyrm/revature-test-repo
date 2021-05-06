package org.demo;
import java.sql.*;

// not workign yet!!

public class UpdateDemo {
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
            String sql= "update employee_schema.employee set city = ? where city = ?;";

            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, "Bangalore");
            preparedStatement.setString(2, "Athens");


            //Step 4 - Execute Query
            int executeUpdate=preparedStatement.executeUpdate();    //query passed in line 24

            System.out.println("Query executed");

            //Step 5 - Process Results
            System.out.println("updated "+ executeUpdate + " items");

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
