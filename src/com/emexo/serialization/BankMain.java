package com.emexo.serialization;

/**
 * Serialization and deserialization example
 */

public class BankMain {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.setAccoutName("Karthik");
        bank.setAccoutNo(12345);
        bank.setBranchName("Chennai");

        // serialization
        BankSerialization obj = new BankSerialization();
        obj.serialize(bank);

       // deserialization
        Bank bank1 = obj.deserialize();
        System.out.println(bank1);
    }
}
