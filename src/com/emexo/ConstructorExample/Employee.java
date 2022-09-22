package com.emexo.ConstructorExample;

public class Employee {

    // Instance variable
    public int empId;
    public String empName;
    public boolean empDob;
    public long empHeight;

    private Salary salary;

    // Instance method
    public Employee(int id, String name, boolean dob, long Height, double sal, int pf, long tds, boolean bankst){

        this.empId = id;
        this.empName = name;
        this.empDob = dob;
        this.empHeight = Height;
        this.salary = new Salary(sal, pf, tds, bankst);
    }

    // Print instance method
    public void getEmployeeDetails()
    {
        System.out.println(empId + ":" + empName + ":" + empDob + ":" + empHeight);
        salary.getSalaryDetails();
    }

}
