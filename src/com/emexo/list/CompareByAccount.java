package com.emexo.list;

import java.util.Comparator;

public class CompareByAccount implements Comparator<Account> {

    @Override
    public int compare(Account emp1, Account emp2) {
        return emp1.getAccountName().compareTo(emp2.getAccountName());
    }
}
