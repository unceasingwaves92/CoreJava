package com.emexo.Set;

public class Employee implements Comparable<Employee> {

    private int employeeId;
    private String employeeName;
    private String address;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // object format override the string if not string converted then display output is hash code format
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
        //Sort out employee ID - ascending order
       //return this.getEmployeeId() - emp.getEmployeeId();
        // sort out employee ID - descending order
       // return emp.getEmployeeId()-this.getEmployeeId();
        // sort out employee name - descending order
         return emp.getEmployeeName().compareTo(this.getEmployeeName());
        // sort out employee name - ascending order
       //  return this.getEmployeeName().compareTo(emp.getEmployeeName());
    }



}
