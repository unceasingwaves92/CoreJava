package com.emexo.concurcolleccopyonArrayListsynchronized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListMain {
    public static void main(String[] args) {
        CopyOnWriteList obj = new CopyOnWriteList();
        obj.setEmpID(4);
        obj.setEmpName("karthik");
        CopyOnWriteList obj1 = new CopyOnWriteList();
        obj1.setEmpID(2);
        obj1.setEmpName("Regu");
        CopyOnWriteList obj2 = new CopyOnWriteList();
        obj2.setEmpID(3);
        obj2.setEmpName("Dakshata");
        CopyOnWriteArrayList<CopyOnWriteList> list = new CopyOnWriteArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
      //  Collections.sort(list);
        Collections.sort(list, (e1, e2) -> e1.getEmpID()-e2.getEmpID());
        CopyOnWriteListMain emp = new CopyOnWriteListMain();
        emp.iterateUsingForEach(list);

    }

    public void iterateUsingForEach(List<CopyOnWriteList> list) {
        if (list != null && list.size() > 0) {
            for (CopyOnWriteList employee : list) {
                System.out.println(employee.getEmpID() + ":" + employee.getEmpName());
            }
        }
    }
}
