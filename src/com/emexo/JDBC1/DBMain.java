package com.emexo.JDBC1;

import java.io.IOException;
import java.sql.SQLException;

public class DBMain {

    // Invoke static method on main method
    public static void main(String[] args) throws SQLException, IOException {
       ContactDAO contactDAO = new ContactDAO();
       Contact contact = new Contact();
       contact.setName("Manika");
       contact.setEmail_Id("manika@gmail.com");
       contact.setAddress("chennai");
       contact.setTelephone("12345678");

        contactDAO.saveContact(contact);

        contact.setEmail_Id("manickaraj@gmail.com");
        contact.setName("Manikaraj");
        contact.setAddress("bangalore");
        contact.setId(22);

        contactDAO.updateContact(contact);
        contactDAO.deleteContact(21);
        System.out.println(contactDAO.getAllUser());
        System.out.println(contactDAO.selectContact("Karthik"));
        Person person = new Person();
        person.setFirst_name("karthik");
        person.setLast_name("kalyanachidambaram");
        contactDAO.photoPerson(person);
        contactDAO.JDBCReadFile(person);

    }
}
