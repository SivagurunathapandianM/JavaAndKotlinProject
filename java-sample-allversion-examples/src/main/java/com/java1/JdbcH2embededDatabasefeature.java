package com.java1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcH2embededDatabasefeature {
	
    public static void main(String[] args) throws SQLException {
        String jdbcURL = "jdbc:h2:mem:testdb";
        String username = "sa";
        String password = "";
 
        Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        System.out.println("Connected to H2 embedded database.");
 
        String sql = "SELECT * FROM students";
 
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
 
        int count = 0;
 
        while (resultSet.next()) {
            count++;
 
            int ID = resultSet.getInt("ID");
            String name = resultSet.getString("name");
            System.out.println("Student #" + count + ": " + ID + ", " + name);
        }
 
        connection.close();
    }

}
