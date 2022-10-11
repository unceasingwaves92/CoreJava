package com.emexo.treeset;

import com.emexo.linkedhashset.Student;

public class Bank implements Comparable<Bank>{

    private String bankName;
    private int bankIfscCode;
    private String bankBranch;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBankIfscCode() {
        return bankIfscCode;
    }

    public void setBankIfscCode(int bankIfscCode) {
        this.bankIfscCode = bankIfscCode;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
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
        Bank e = (Bank) o;
        //   return ((this.getEmployeeName()).compareTo(e.getEmployeeName()));
        //return (this.getBankIfscCode())==(e.getBankIfscCode());
          return (this.getBankBranch())==(e.getBankBranch());
    }

   /* @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getBankIfscCode();
        return result;
    }
*/
    @Override
    public int hashCode() {
        final String PRIME = "kk";
        String result = "s";
        result = PRIME + result + getBankBranch();
        return Integer.parseInt(result);

    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankIfscCode=" + bankIfscCode +
                ", bankBranch='" + bankBranch + '\'' +
                '}';
    }

    @Override
    public int compareTo(Bank bank) {
      //  return bank.getBankIfscCode()-this.getBankIfscCode();
          return this.getBankBranch().compareTo(bank.getBankBranch());

    }
}
