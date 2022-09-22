package com.emexo.Jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class InsertQuery {

    private String name;

    private String emailid;

    private String address;

    private String telephone;
    public static void getConnection(String path, String name, String emailid, String address, String telephone) throws FileNotFoundException, IOException {
        Connection conn = null;
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream(path);
        props.load(fis);
        try {

           conn = DriverManager.getConnection(props.getProperty("DB_URL"),
                    props.getProperty("DB_USERNAME"),
                    props.getProperty("DB_PASSWORD"));

            String sql = "INSERT INTO Contact (name, email_id, address, telephone) values (?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, emailid);
            statement.setString(3, address);
            statement.setString(4, telephone);

            int i=statement.executeUpdate();
            System.out.println("record successfully inserted");

            conn.close();

        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}


