package com.emexo.Jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionThirdWay {

    public static Connection getConnection(String path) throws FileNotFoundException, IOException{
        Connection conn = null;
        Properties props = new Properties();
        try {
            FileInputStream fis = new FileInputStream(path);
            props.load(fis);

            conn = DriverManager.getConnection(props.getProperty("DB_URL"),
                    props.getProperty("DB_USERNAME"),
                    props.getProperty("DB_PASSWORD"));
            if (conn != null) {
                System.out.println("Connected to the database karthik");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
        return conn;
    }
}
