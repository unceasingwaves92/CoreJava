package com.emexo.JDBC2;

import com.emexo.JDBC1.DBConnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
    public class jdbcQueryImplementation implements JdbcQuery{

        @Override
        public void insertContact(Contact contact) throws IOException, SQLException {
            Connection conn = null;
            String response = null;
            try {
                conn = DBConnection.ConnectionProp();
                String sql = "INSERT INTO ContactBook1(ContactfirstName,ContactlastName,ContactEmail,ContactPhnNum) VALUES(?,?,?,?)";
                PreparedStatement statement = conn.prepareStatement(sql);
                //statement.setObject(2,stud.getFirst_name());
                statement.setString(1, contact.getContactFirstName());
                statement.setString(2, contact.getContactLastName());
                statement.setString(3, contact.getContactEmail());
                statement.setInt(4, contact.getContactPhnNum());
                //System.out.println(contact);
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("new row got inserted successfully");
                }
            }catch(Exception ex) {
                ex.printStackTrace();
            }
            finally {
                System.out.println("End of Insertion method");
            }
        }



        @Override
        public void deleteContact(String name) {
            Connection conn = null;
            String response = null;
            try {
                conn = DBConnection.ConnectionProp();

                String query = "DELETE FROM ContactBook WHERE ContactFirstName=?";
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1,name);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println(rowsInserted + "row got deleted successfully");
                }
            } catch (Exception ex) {
                System.out.println("Connection using method 3 is creating error");
                ex.printStackTrace();
            }

        }

        @Override
        public void updateContact(String FirstName, String LastName, int Phn) throws SQLException {
            Connection conn = null;
            String response = null;
            try {
                conn = DBConnection.ConnectionProp();
                String query = "UPDATE ContactBook SET ContactFirstName=?,ContactLastName=? WHERE ContactPhnNum=?";

                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1, FirstName);
                statement.setString(2, LastName);
                statement.setInt(3,Phn);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println(rowsInserted + "row got updated successfully");
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("End of update block");
            }
        }
        public List selectallquerys() throws IOException, SQLException {
            Connection conn = null;
            String response = null;

            List<Contact> list = null;
            try {
                conn = DBConnection.ConnectionProp();
                String sql = "SELECT * FROM ContactBook";

                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);

                list = new ArrayList<>();
                while (result.next()) {
                    String ContactFirstName = result.getString("ContactFirstName");
                    String ContactLastName = result.getString("ContactLastName");
                    String ContactEmail = result.getString("ContactEmail");
                    int ContactPhnNum = result.getInt("ContactPhnNum");

                    Contact st = new Contact();
                    st.setContactFirstName(ContactFirstName);
                    st.setContactFirstName(ContactLastName);
                    st.setContactEmail(ContactEmail);
                    st.setContactPhnNum(ContactPhnNum);
                    list.add(st);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        
            return list;
        }
        public List selectPerticularContact(String name) throws IOException, SQLException {
            Connection conn = null;
            String response = null;

            List<Contact> list = null;
            try {
                conn = DBConnection.ConnectionProp();
                //String sql = "SELECT * FROM student WHERE first_name= '"+name+"'";

                String sql = "SELECT * FROM ContactBook WHERE ContactFirstName= ?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, name);

                //  Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery();

                list = new ArrayList<>();
                while (result.next()) {
                    String ContactFirstName = result.getString("ContactFirstName");
                    String ContactLastName = result.getString("ContactLastName");
                    String ContactEmail = result.getString("ContactEmail");
                    int ContactPhnNum = result.getInt("ContactPhnNum");

                    Contact st = new Contact();
                    st.setContactFirstName(ContactFirstName);
                    st.setContactLastName(ContactLastName);
                    st.setContactEmail(ContactEmail);
                    st.setContactPhnNum(ContactPhnNum);
                    list.add(st);
                }
            }catch(Exception ex) {
                ex.printStackTrace();
            }
            return list;
        }
    }




