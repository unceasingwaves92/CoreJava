package com.emexo.concurrentcollectionsynchronizedset;

import com.emexo.hashset.Employee;

public class SynchronizedSetExample implements Comparable<SynchronizedSetExample> {

    private String empName;
    private int empId;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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
        SynchronizedSetExample e = (SynchronizedSetExample) o;
        //   return ((this.getEmployeeName()).compareTo(e.getEmployeeName()));
        return (this.getEmpId()==(e.getEmpId()));
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getEmpId();
        return result;
    }

    @Override
    public String toString() {
        return "SynchronizedSetExample{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                '}';
    }

    @Override
    public int compareTo(SynchronizedSetExample emp) {
        return this.getEmpId()-emp.getEmpId();
    }
}
