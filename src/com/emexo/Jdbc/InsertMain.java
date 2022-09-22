package com.emexo.Jdbc;

import java.io.IOException;

public class InsertMain {

    public static void main(String[] args) throws IOException {

        InsertQuery obj = new InsertQuery();
        obj.getConnection("C:\\Users\\Dell\\IdeaProjects\\Emexo\\src\\com\\emexo\\Jdbc\\db.properties", "gayathri", "gay@gmail.com", "australia", "555555");
    }
}
