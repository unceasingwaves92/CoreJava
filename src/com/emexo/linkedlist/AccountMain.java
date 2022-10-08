package com.emexo.linkedlist;

import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public class AccountMain {

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setAccountNo(3);
        account1.setAccountName("Sandhya");

        Account account2 = new Account();
        account2.setAccountNo(4);
        account2.setAccountName("Karthik");

        Account account3 = new Account();
        account3.setAccountNo(1);
        account3.setAccountName("Manika");

        Account account4 = new Account();
        account4.setAccountNo(2);
        account4.setAccountName("Ranjana");

        Account account5 = new Account();
        account5.setAccountNo(2);
        account5.setAccountName("Ranjana");

        List<Account> accounts = new LinkedList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);

        // iterate for each loop

      /*  for (Account acct : accounts) {
            System.out.println(acct.getAccountNo() + ":" + acct.getAccountName());
        }

        System.out.println("****************************");
        // iterate for lambda expression

        accounts.forEach(acc -> System.out.println(acc.getAccountNo() + ":" + acc.getAccountName()));*/

        //Collections.sort(accounts);

        // multiple attribute
        // ascending order

     //   Collections.sort(accounts, Comparator.comparing(Account::getAccountName)
         //       .thenComparing(Account::getAccountNo));

        // descending order
       // Collections.sort(accounts, (e1, e2) -> e2.getAccountName().compareTo(e1.getAccountName()));

      //  Collections.sort(accounts, (e1, e2) -> e2.getAccountNo()-e1.getAccountNo());
        // ascending order
      //  accounts.sort(Comparator.comparing(e->e.getAccountNo()));

        // before java 8
       // Collections.sort(accounts, new SortByAccountNoComparator());

          Collections.sort(accounts, new SortByAccountNameComparator());

        AccountList obj = new AccountList();
        // obj.iterateUsingForEach(accounts);
       // obj.iterateUsingForLoop(accounts);
        // obj.iterateUsingListIterator(accounts);
         obj.iterateUsingLambdaExpression(accounts);
         //  obj.iterateUsingForLoop(accounts);
         //   obj.getSize(accounts);
    }


 /* // iterate for each loop
    public void iterateUsingForEach(List<Account> list) {
        if (list != null && list.size() > 0) {
            for (Account account : list) {
                System.out.println(account.getAccountNo() + ":" + account.getAccountName());
            }
        }
    }*/

   /* // iterate for lambda expression
    public void iterateUsingLambdaExpression(List<Account> accounts) {

        accounts.forEach(acc -> System.out.println(acc.getAccountNo() + ":" + acc.getAccountName()));
    }
    // iterate for while loop -> forward/backward direction

    public void iterateUsingListIterator(List<Account> accounts) {
        if (CollectionUtils.isNotEmpty(accounts)) {
            ListIterator<Account> listIterator = accounts.listIterator();
            System.out.println("Forward direction");
            while (listIterator.hasNext()) {
                System.out.println(listIterator.next());
            }
            System.out.println("Backward direction");
            while (listIterator.hasPrevious()) {
                System.out.println(listIterator.previous());
            }
        }
    }

    // iterate for loop
    public void iterateUsingForLoop(List<Account> list){
        if(list!=null){
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
    }

    // iterate size of list
    public void getSize(List<Account> list) {
        int size = list.size();
        System.out.println(size);
    }*/

}

