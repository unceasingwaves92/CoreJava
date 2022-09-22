package com.emexo.primitivedatatype;

public class DataType {

    // Instance variable
    public byte empId;
    public short empSeat;
    public int empSalary;
    public long empHeight;
    public float empWeight;
    public double empDebt;
    public char empInitial;
    public boolean empDOB;

    // Parameterized constructor
    public DataType(byte rollno, boolean date, short seat, int salary, long height, float weight, double debt, char initial) {

        this.empId = rollno;
        this.empDOB = date;
        this.empSeat = seat;
        this.empSalary = salary;
        this.empHeight = height;
        this.empWeight = weight;
        this.empDebt = debt;
        this.empInitial = initial;

    }

    // Instance method
   public void getDataTypeDetails() {

        System.out.println(empId + ":" + empDOB + ":" + empSeat + ":" + empSalary + ":" + empHeight + ":" + empWeight + ":" + empDebt + ":" + empInitial);
    }


}
