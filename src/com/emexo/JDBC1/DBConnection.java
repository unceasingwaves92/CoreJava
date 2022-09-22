package com.emexo.JDBC1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {


    public static void Connection() {

        Connection conn1 = null;

        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/regu";
            String user = "root";
            String password = "Chennai@12345";
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database contact");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void ConnectionURL() {

        Connection conn2 = null;
        try {

            // connect way #2
            String url2 = "jdbc:mysql://localhost:3306/regu?user=root&password=Chennai@12345";
            conn2 = DriverManager.getConnection(url2);
            if (conn2 != null) {
                System.out.println("Connected to the database contact");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Mostly used this method
    public static Connection ConnectionProp() throws IOException, SQLException {
        Connection conn3 = null;
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\Emexo\\src\\com\\emexo\\JDBC1\\db.properties");
        props.load(fis);
        try {
            // connect way #3

           conn3 = DriverManager.getConnection(props.getProperty("DB_URL"),
                    props.getProperty("DB_USERNAME"),
                    props.getProperty("DB_PASSWORD"));
            if (conn3 != null) {
                System.out.println("Connected to the database contact");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn3;
    }


}
