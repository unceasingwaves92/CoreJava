package com.emexo.hashmap;

import com.emexo.Map.EmployeeExample1;

public class Employee {

    private int empID;
    private String empEmail;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        //  EmployeeExample e = (EmployeeExample) o;
        //   return (this.getEmployeeID()==(e.getEmployeeID()));

        Employee e = (Employee) o;
        return (this.getEmpID()==(e.getEmpID()));
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getEmpID();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empEmail='" + empEmail + '\'' +
                '}';
    }
}
