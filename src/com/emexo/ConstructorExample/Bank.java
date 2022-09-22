package com.emexo.ConstructorExample;

public class Bank {

    // Static variable
    public static final String BANK_NAME = "SCOTLAND BANK";

    // Instance variable
    public String bankAdd;
    public String bankBrch;

    // Parameterized constructor
    public Bank(String address, String branch) {

        this.bankAdd = address;
        this.bankBrch = branch;
    }

    // Print static method
    public static void getBankName() {
        System.out.println(Bank.BANK_NAME);
    }

    // Print instance method
    public void getBankDetails(){
        System.out.println(bankAdd + ":" + bankBrch);
    }
}
