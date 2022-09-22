package com.emexo.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// comparator
// linked list
public class Main1 {

    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountName("Manicka");
        account.setBalance(100000);

        Account obj1 = new Account();
        obj1.setAccountName("Sandhya");
        obj1.setBalance(20000);

        Account obj2 = new Account();
        obj2.setAccountName("Kinjal");
        obj2.setBalance(50000);

        List<Account> list = new LinkedList<>();
        list.add(account);
        list.add(obj1);
        list.add(obj2);
       // System.out.println(list);

      //  Collections.sort(list, (n1, n2) -> n2.getAccountName().compareTo(n1.getAccountName()));
        Collections.sort(list, (n1, n2) -> n1.getBalance()-n2.getBalance());

        list.forEach(emp-> System.out.println("Account Name: " + emp.getAccountName() + " " + "Balance: "+ emp.getBalance()));


    }
}
