package com.emexo.list;

import java.util.Comparator;

public class Account   {

    private String accountName;
    private int balance;



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
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }


  //  @Override
  //  public int compareTo(Account emp) {
    //    return emp.getAccountName().compareTo(this.getAccountName());
   // }
}
