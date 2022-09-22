package com.emexo.list1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListMainClass {
    public static void main(String[] args) {
        LinkedList<Account> accountLinkedList = new LinkedList<>();
        Account acc1 = new Account();
        acc1.setAccountNo("1001");
        acc1.setAccountName("Savings");
        acc1.setBalance(5000);
        accountLinkedList.add(acc1);

        Account acc2 = new Account();
        acc2.setAccountNo("1002");
        acc2.setAccountName("Current");
        acc2.setBalance(1000);
        accountLinkedList.add(acc2);


        Account acc3 = new Account();
        acc3.setAccountNo("1003");
        acc3.setAccountName("FD");
        acc3.setBalance(12000);
        accountLinkedList.add(acc3);


        Account acc4 = new Account();
        acc4.setAccountNo("1004");
        acc4.setAccountName("RD");
        acc4.setBalance(6000);
        accountLinkedList.add(acc4);

        OperationAccount.getAllAccount(accountLinkedList);
        accountLinkedList =OperationAccount.sortByAccountName(accountLinkedList);
        System.out.println("After sort by account name");
        OperationAccount.getAllAccount(accountLinkedList);
        accountLinkedList=OperationAccount.sortByBalance(accountLinkedList);
        System.out.println("After sort by balance");
        OperationAccount.getAllAccount(accountLinkedList);

        Set<String> set = new HashSet<>();

        set.add("Bangalore");
        set.add("Mumbai");
        set.add("Chennai");
        set.add("Mumbai");
        set.add(null);// store as first element

        for(String data:set){
            System.out.println(data);
        }

        set.forEach(data-> System.out.println(data));
    }

    }

