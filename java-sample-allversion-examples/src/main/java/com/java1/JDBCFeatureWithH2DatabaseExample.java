package com.java1;

import java.sql.*;


public class JDBCFeatureWithH2DatabaseExample {
	
	/* To Download H2 DataBase and Console:
	 * https://www.codejava.net/java-se/jdbc/connect-to-h2-database-examples*/

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       /* String jdbcURL = "jdbc:h2:mem:testdb";
        final String JDBC_DRIVER = "org.h2.Driver";
        
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(jdbcURL);
 
        System.out.println("Connected to H2 in-memory database.");
 
        String sql = "Create table students (ID int primary key, name varchar(50))";
         
        Statement statement = connection.createStatement();
         
        statement.execute(sql);
         
        System.out.println("Created table students.");
         
        sql = "Insert into students (ID, name) values (1, 'siva')";
         
        int rows = statement.executeUpdate(sql);
         
        if (rows > 0) {
            System.out.println("Inserted a new row.");
        }
        */
    	
    	   DriverManager.registerDriver(new org.h2.Driver());
           Connection c = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DATABASE_TO_UPPER=false");
           PreparedStatement stmt = c.prepareStatement("CREATE TABLE PERSON (ID INT PRIMARY KEY, FIRSTNAME VARCHAR(64), LASTNAME VARCHAR(64))");
           stmt.execute();
           stmt.close();
          
        DatabaseMetaData dbmd=c.getMetaData();  
        
        System.out.println("Driver Name: "+dbmd.getDriverName());  
        System.out.println("Driver Version: "+dbmd.getDriverVersion());  
        System.out.println("UserName: "+dbmd.getUserName());  
        System.out.println("URL: "+dbmd.getURL()); 
        System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
        System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
 
        c.close();
 
    }
}
