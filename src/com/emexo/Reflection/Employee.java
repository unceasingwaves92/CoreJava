package com.emexo.Reflection;

public class Employee {

    private int empId;

    private void getEmployee() {
        System.out.println("Employee Details");
    }

    public void getOrgDetails(int i) {
        System.out.println("organization details");
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                '}';
    }
}
