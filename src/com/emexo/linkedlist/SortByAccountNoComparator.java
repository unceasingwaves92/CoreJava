package com.emexo.linkedlist;

import java.util.Comparator;

public class SortByAccountNoComparator implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        return  o1.getAccountNo()-o2.getAccountNo();
    }
}
