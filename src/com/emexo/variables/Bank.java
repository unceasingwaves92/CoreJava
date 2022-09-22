package com.emexo.variables;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;

import javax.xml.bind.SchemaOutputResolver;

public class Bank {

    // static variable
    public static final String BANK_NAME="ICICI BANK";
    public static final String ACCT_NO="996216699";

    public static String IFSC_CODE="111";



    public static void main(String[] args) {

        // invoke main method on static variable
        System.out.println(Bank.BANK_NAME);
        System.out.println(Bank.ACCT_NO);
        System.out.println(Bank.IFSC_CODE);

    }
}
