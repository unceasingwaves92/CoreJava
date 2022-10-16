package com.emexo.concurcolleccopyonArrayListsynchronized;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteList implements Comparable<CopyOnWriteList>{

    private int empID;
    private String empName;

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

    @Override
    public String toString() {
        return "CopyOnWriteList{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                '}';
    }

    @Override
    public int compareTo(CopyOnWriteList emp) {
        return this.getEmpID()-emp.getEmpID();
    }
}
