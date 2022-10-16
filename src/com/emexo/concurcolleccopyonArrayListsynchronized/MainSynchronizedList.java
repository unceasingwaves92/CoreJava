package com.emexo.concurcolleccopyonArrayListsynchronized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainSynchronizedList {
    public static void main(String[] args) {
        ArrayListSynchronizedList list1 = new ArrayListSynchronizedList();
        list1.setStudentID(1);
        list1.setStudentName("karthik");
        ArrayListSynchronizedList list2 = new ArrayListSynchronizedList();
        list2.setStudentID(2);
        list2.setStudentName("Dakshata");
        ArrayListSynchronizedList list3 = new ArrayListSynchronizedList();
        list3.setStudentID(3);
        list3.setStudentName("Dakshata");
        ArrayListSynchronizedList list4 = new ArrayListSynchronizedList();
        list4.setStudentID(4);
        list4.setStudentName("Dhivya");
        List<ArrayListSynchronizedList> acc = new ArrayList<>();
        acc.add(list1);
        acc.add(list2);
        acc.add(list3);
        acc.add(list4);
        Collections.sort(acc, (e1, e2)->e1.getStudentName().compareTo(e2.getStudentName()));
        MainSynchronizedList obj = new MainSynchronizedList();
        Collections.synchronizedList(acc);
      //  Collections.sort(acc, (e1,e2)-> e1.getStudentName().compareTo(e2.getStudentName()));
        obj.iterateUsingLambda(acc);

    }

         // iterate lambda expression
        public void iterateUsingLambda(List<ArrayListSynchronizedList> acc){
            acc.forEach(data-> System.out.println(data.getStudentID()+ ":" +data.getStudentName()));
        }

    }



