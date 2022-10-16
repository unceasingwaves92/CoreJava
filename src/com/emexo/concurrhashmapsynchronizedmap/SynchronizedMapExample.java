package com.emexo.concurrhashmapsynchronizedmap;

import com.emexo.hashmap.Employee;

public class SynchronizedMapExample {
    private String studentName;
    private int studentRollNo;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
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

        SynchronizedMapExample e = (SynchronizedMapExample) o;
        return (this.getStudentRollNo()==(e.getStudentRollNo()));
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getStudentRollNo();
        return result;
    }
    @Override
    public String toString() {
        return "SynchronizedMapExample{" +
                "studentName='" + studentName + '\'' +
                ", studentRollNo=" + studentRollNo +
                '}';
    }
}
