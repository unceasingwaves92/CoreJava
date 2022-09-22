package com.emexo.Constructor;

public class Address {

    // Static varaible
    public static final String EMP_ADDRESS = "BANGALORE";

    // Instance variable
    public int empPlot;

    public String empCity;

    public Address(int idNumber, String location) {

        this.empPlot = idNumber;
        this.empCity = location;
    }

    // Print static method
    public static void getAddress() {
        System.out.println(Address.EMP_ADDRESS);
    }

    // Print instance method
    public void getAddressDetails() {
        System.out.println(empPlot + ":" + empCity);
    }

}
