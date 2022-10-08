package com.emexo.linkedlist;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AccountList extends Account {

    // iterate for each loop
    public void iterateUsingForEach(List<Account> list) {
        if (list != null && list.size() > 0) {
            for (Account account : list) {
                System.out.println(account.getAccountNo() + ":" + account.getAccountName());
            }
        }
    }

    // iterate for each loop

    public void iterateUsingForEach1(List<Account> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            for (Account account : list) {
                System.out.println(account.getAccountNo() + ":" + account.getAccountName());
            }
        }
    }

    // iterate for lambda expression
    public void iterateUsingLambdaExpression(List<Account> list) {

        list.forEach(acc -> System.out.println(acc.getAccountNo() + ":" + acc.getAccountName()));
    }

    // Iterate for while loop ->forward direction

    public void iterateUsingIterator(List<Account> list){
        if (CollectionUtils.isNotEmpty(list)) {
            Iterator<Account> iterator = list.iterator();
            System.out.println("Forward direction");
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

    // List iterate for while loop -> forward/backward direction

    public void iterateUsingListIterator(List<Account> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            ListIterator<Account> listIterator = list.listIterator();
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
    }
}
