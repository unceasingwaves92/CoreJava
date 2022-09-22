package com.emexo.Constructor;

public class Employee1 {

    // static variable
    public static final String EMPLOYEE_NAME="REGU";

    // instance variable
    public int empId;
    public String empDestination;

    private Address address;

    // Instance variable initialize the constructor
    // constructor no return type
    public Employee1(int id, String destination, int idNumber, String location)
    {
        this.empId = id;
        this.empDestination= destination;
        this.address = new Address(idNumber, location);

    }
    public static void getEmployeeName() {
        System.out.println(Employee1.EMPLOYEE_NAME);
    }

    // Print instance method
    public void getEmployeeDetails() {

        System.out.println(empId +":"+ empDestination);
        address.getAddressDetails();

    }


}
