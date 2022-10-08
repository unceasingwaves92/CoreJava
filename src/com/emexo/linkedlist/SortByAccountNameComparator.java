package com.emexo.linkedlist;

import java.util.Comparator;

public class SortByAccountNameComparator implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        return o1.getAccountName().compareTo(o2.getAccountName());
    }
}
