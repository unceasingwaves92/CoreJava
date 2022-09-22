package com.emexo.list1;

public class Account implements Comparable<Account> {
    private String accountNo;
    private String accountName;
    private int balance;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Account o) {
        return o.balance - this.balance; //descending order
    }
}
