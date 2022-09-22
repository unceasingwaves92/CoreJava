package com.emexo.list1;

import java.util.Collections;
import java.util.LinkedList;

public class OperationAccount {
    public static void getAllAccount(LinkedList<Account> accountLinkedList) {
        accountLinkedList.forEach(account -> {
            System.out.println("Account no : " + account.getAccountNo());
            System.out.println("Account name : " + account.getAccountName());
            System.out.println("Account Balance : " + account.getBalance());
            System.out.println("......");
        });
    }
  public static  LinkedList<Account> sortByAccountName(LinkedList<Account> accountLinkedList)
  {
      Collections.sort(accountLinkedList,(a1,a2)->a1.getAccountName().compareTo(a2.getAccountName()));
      return  accountLinkedList;
  }

    public static  LinkedList<Account> sortByBalance(LinkedList<Account> accountLinkedList)
    {
        Collections.sort(accountLinkedList);
        return  accountLinkedList;
    }
}
