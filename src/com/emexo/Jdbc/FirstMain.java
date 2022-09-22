package com.emexo.Jdbc;

public class FirstMain {

    public static void main(String[] args) {

        ConnectionFirstWay obj = new ConnectionFirstWay();
        obj.getConnection("jdbc:mysql://localhost:3306/contact", "root", "nedumaran@86");
    }
}
