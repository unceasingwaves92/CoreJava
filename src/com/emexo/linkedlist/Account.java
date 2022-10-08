package com.emexo.linkedlist;

public class Account implements Comparable<Account> {

    private int accountNo;
    private String accountName;

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

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", accountName='" + accountName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Account account) {
        // sort ascending order
     //   return this.getAccountNo()-account.getAccountNo();
        // sort descending order
       //   return account.getAccountNo()-this.getAccountNo();
        //    return this.getAccountName().compareTo(account.getAccountName());
            return account.getAccountName().compareTo(this.getAccountName());
    }
}
