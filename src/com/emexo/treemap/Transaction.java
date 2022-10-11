package com.emexo.treemap;

import com.emexo.hashmap.Employee;

public class Transaction implements Comparable<Transaction>{

    private int accountNo;
    private String accountName;
    private int amount;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

        Transaction e = (Transaction) o;
        return (this.getAccountNo()==(e.getAccountNo()));
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getAccountNo();
        return result;
    }
    @Override
    public String toString() {
        return "Transaction{" +
                "accountNo=" + accountNo +
                ", accountName='" + accountName + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int compareTo(Transaction transaction) {
        return this.getAccountNo()- transaction.getAccountNo();
    }
}
