package com.emexo.concurrhashmapsynchronizedmap;

public class ConcurrentHashMapExample {
    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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

        ConcurrentHashMapExample e = (ConcurrentHashMapExample) o;
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
        return "ConcurrentHashMapExample{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
