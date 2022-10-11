package com.emexo.hashset;

import com.emexo.Set.EmployeeExample2;

public class Employee  {

    private int employeeId;
    private String employeeName;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == this) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        //  EmployeeExample e = (EmployeeExample) o;
        //   return (this.getEmployeeID()==(e.getEmployeeID()))
        Employee e = (Employee) o;
      //   return ((this.getEmployeeName()).compareTo(e.getEmployeeName()));
        return (this.getEmployeeId()==(e.getEmployeeId()));
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getEmployeeId();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }

    /*@Override
    public int compareTo(Employee emp) {
        return this.getEmployeeId()-emp.getEmployeeId();
    }*/
}
