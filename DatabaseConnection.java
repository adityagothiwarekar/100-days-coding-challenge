package com.example.javafx_login;

import java.sql.Connection;
import java.sql.DriverManager;

 public class DatabaseConnection {
     public static Connection connectDb(){

         try{

             Class.forName("com.mysql.jdbc.Driver");

             Connection connect =
                 DriverManager.getConnection("jdbc:mysql://localhost/marco?", "", "");

             return connect;

         }catch(Exception e){e.printStackTrace();}

         return null;
     }
}
