package com.emexo.ConstructorExample;

public class Salary {

    // Instance variable

    public double empSalary;
    public int empPF;
    public long empTax;
    public boolean empBankSt;

    // Instance method
    // No return type
    public Salary(double sal, int pf, long tds, boolean bankst){

        this.empSalary = sal;
        this.empPF = pf;
        this.empTax = tds;
        this.empBankSt = bankst;
    }

    // Print instance method
    public void getSalaryDetails() {

        System.out.println(empSalary + ":" + empPF + ":" + empTax + ":" + empBankSt);
    }


}
