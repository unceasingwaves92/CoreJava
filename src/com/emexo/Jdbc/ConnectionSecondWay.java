package com.emexo.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSecondWay {

    public void getConnection(String url) {

        Connection conn = null;
        try {
            String url1 = url;
            conn = DriverManager.getConnection(url1);
            if (conn != null) {
                System.out.println("Connected to the database karthik");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}


