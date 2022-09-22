package com.emexo.Jdbc;

import java.io.IOException;

public class ThirdMain {

    public static void main(String[] args) throws IOException {

        ConnectionThirdWay obj = new ConnectionThirdWay();
        obj.getConnection("C:\\Users\\Dell\\IdeaProjects\\Emexo\\src\\com\\emexo\\Jdbc\\db.properties");
    }
}
