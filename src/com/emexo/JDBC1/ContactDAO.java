package com.emexo.JDBC1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import java.sql.Blob;


public class ContactDAO {

    private static final int BUFFER_SIZE = 4096 ;

    public String saveContact(Contact contact) throws SQLException {

        Connection conn = null;
        String response = null;
        try {
            conn = DBConnection.ConnectionProp();
            String sql = "INSERT INTO Contact (name, email_id, address, telephone) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, contact.getName());
            statement.setString(2, contact.getEmail_Id());
            statement.setString(3, contact.getAddress());
            statement.setString(4, contact.getTelephone());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response = "A new user was inserted successfully!";
            }


        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            conn.close();
        }
        return response;
    }

    public String updateContact(Contact contact) throws SQLException {

        Connection conn = null;
        String response = null;
        try {
            conn = DBConnection.ConnectionProp();
            String sql = "UPDATE Contact SET email_id=?, name=?, address=? WHERE id=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, contact.getEmail_Id());
            statement.setString(2, contact.getName());
            statement.setString(3, contact.getAddress());
            statement.setInt(4, contact.getId());
           // statement.setInt(5, id);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response = "A new user was updated successfully!";
            }


        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            conn.close();
        }
        return response;
    }


    public String deleteContact(int id) throws SQLException{
        Connection conn = null;
        String response = null;
        try {
            conn = DBConnection.ConnectionProp();
            String sql = "DELETE FROM Contact WHERE id=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response = "A new user was deleted successfully!";
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            conn.close();
        }

        return response;
    }

    public List<Contact> getAllUser() {

        Connection conn = null;
        List<Contact> contacts = null;

        try {

            conn = DBConnection.ConnectionProp();
            String sql = "Select * from Contact";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            contacts = new ArrayList<>();
            while(result.next()){
                Contact contact = new Contact();
                contact.setName(result.getString("name"));
                contact.setEmail_Id(result.getString("email_id"));
                contacts.add(contact);


            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return contacts;
    }

    public List<Contact> selectContact(String name) throws SQLException{
        Connection conn = null;
        List<Contact> contacts = null;
        String response = null;

        try {
            conn = DBConnection.ConnectionProp();
            String sql = "SELECT name, email_id, address, telephone FROM Contact WHERE name=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet rowsInserted = statement.executeQuery();

                response = "A existing user was getting successfully!";

            contacts = new ArrayList<>();
            while(rowsInserted.next())
            {
                Contact contact = new Contact();
                contact.setName(rowsInserted.getString("name"));
                contact.setEmail_Id(rowsInserted.getString("email_id"));
                contact.setAddress(rowsInserted.getString("address"));
                contact.setTelephone(rowsInserted.getString("telephone"));
                contacts.add(contact);
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            conn.close();
        }


        return contacts;
    }

    public String photoPerson(Person person) throws SQLException {

        Connection conn = null;
        String response = null;
        String filePath = "C:\\Users\\Dell\\Pictures\\Camera Roll\\karthik1.jpg";
        try {
            conn = DBConnection.ConnectionProp();
            String sql = "INSERT INTO person (first_name, last_name, photo) VALUES (?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, person.getFirst_name());
            statement.setString(2, person.getLast_name());
            InputStream inputStream = new FileInputStream(filePath);

            statement.setBlob(3, inputStream);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted >= 0) {
                System.out.println("A contact was inserted with photo image.");
            }


        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            conn.close();
        }
        return response;
    }

    public String JDBCReadFile(Person person) throws SQLException {

        Connection conn = null;
        String response = null;
        String filePath = "E:\\Full Stack Development\\Spring Boot\\JDBC_Photo\\test.jpg";
        try {
            conn = DBConnection.ConnectionProp();
            String sql = "SELECT photo FROM person WHERE first_name=? AND last_name=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, person.getFirst_name());
            statement.setString(2, person.getLast_name());
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Blob blob = result.getBlob("photo");
                InputStream inputStream = blob.getBinaryStream();
                OutputStream outputStream = new FileOutputStream(filePath);

                int bytesRead = -1;
                byte[] buffer = new byte[BUFFER_SIZE];
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                inputStream.close();
                outputStream.close();
                System.out.println("File saved");
            }


        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            conn.close();
        }
        return response;
    }




}
