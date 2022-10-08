package com.emexo.arraylist;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ExampleArrayList obj = new ExampleArrayList();
        List<String> list = obj.addElements("Chennai", "Kochi", "Punjab", "Delhi", "haryana");
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(obj.addElementsFromArray("punjab", "kolkata", "bihar"));
        System.out.println(list);
        System.out.println(obj.getContainsValue(list, "Punjab"));
        //System.out.println(list)
        System.out.println(obj.addElementsFromArray("kerala", "uttarpradesh"));
       // obj.getElementForLoop(list);
       // obj.getCollection(list);
        //obj.getElementByIterator(list);
       // obj.getElementByLambdaExpression(list);
       // obj.getElementByListIterator(list);
        System.out.println(obj.getIndexValue(list,"haryana"));

    }
}
