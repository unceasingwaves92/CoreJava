package com.emexo.JDBC2;

import java.io.IOException;
import java.sql.SQLException;

    public class MainProgram {

        public static void main(String[] args) throws SQLException, IOException {
            Contact contact = new Contact();
            contact.setContactFirstName("Rupa");
            contact.setContactLastName("Kumari");
            contact.setContactEmail("rupa@gmail.com");
            contact.setContactPhnNum(1234567890);

            Contact contact1 = new Contact();
            contact1.setContactFirstName("Rupa1");
            contact1.setContactLastName("Kumari1");
            contact1.setContactEmail("rupa1@gmail.com");
            contact1.setContactPhnNum(1234567888);

            Contact contact2 = new Contact();
            contact2.setContactFirstName("Rupa2");
            contact2.setContactLastName("Kumari2");
            contact2.setContactEmail("rupa2@gmail.com");
            contact2.setContactPhnNum(1234567777);

            jdbcQueryImplementation querysExample = new jdbcQueryImplementation();

            querysExample.insertContact(contact1);

            //querysExample.updateContact("Rupa2","Kumari2",1234567890);
            //querysExample.deleteContact("Rupa2");
            //System.out.println(querysExample.selectallquerys());
            //System.out.println(querysExample.selectPerticularContact("Rupa2"));

        }
    }




