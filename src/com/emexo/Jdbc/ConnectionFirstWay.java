package com.emexo.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFirstWay {


    public void getConnection(String url, String user, String password){
        Connection conn = null;
        try {

            // connect way #1
            String url1 = url;
            String user1 = user;
            String password1 = password;
            conn = DriverManager.getConnection(url1, user1, password1);
            if (conn != null) {
                System.out.println("Connected to the database karthik");
            }
        }catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();}

    }
}
