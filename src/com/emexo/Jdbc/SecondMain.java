package com.emexo.Jdbc;

public class SecondMain {

    public static void main(String[] args) {

        ConnectionSecondWay obj = new ConnectionSecondWay();
        obj.getConnection("jdbc:mysql://localhost:3306/contact?user=root&password=nedumaran@86");
    }
}
