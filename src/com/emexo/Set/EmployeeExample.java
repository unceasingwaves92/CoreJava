package com.emexo.Set;

public class EmployeeExample implements Comparable<EmployeeExample> {
    private int employeeID;
    private String employeename;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;


    @Override
    public int compareTo(EmployeeExample emp) {
        return emp.getEmployeeID() - this.getEmployeeID();
       // return emp.getEmployeename().compareTo(this.getEmployeename());
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
     //   return (this.getEmployeeID()==(e.getEmployeeID()));

        EmployeeExample e = (EmployeeExample) o;
        return (e.getEmployeeID()==(this.getEmployeeID()));
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getEmployeeID();
        return result;
    }

    @Override
    public String toString() {
        return "EmployeeExample{" +
                "employeeID=" + employeeID +
                ", employeename='" + employeename + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
