package com.emexo.Map;

import com.emexo.Set.EmployeeExample;

public class EmployeeExample1 {

    private int empID;

    private String empName;

    private String empAddress;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "EmployeeExample1{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }

    // Avoid duplicate to declare hashcode and decode
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

        EmployeeExample1 e = (EmployeeExample1) o;
        return (e.getEmpID()==(this.getEmpID()));
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getEmpID();
        return result;
    }

}
