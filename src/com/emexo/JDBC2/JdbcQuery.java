package com.emexo.JDBC2;

import java.io.IOException;
import java.sql.SQLException;

public interface JdbcQuery {

        void insertContact(Contact contact) throws IOException, SQLException;
        void deleteContact(String name);
        void updateContact(String FirstName,String LastName,int Phn) throws SQLException;
    }

