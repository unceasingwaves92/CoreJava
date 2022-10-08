package com.emexo.arraylist;

import java.util.List;

public class MainArrDiffMethod {

    public static void main(String[] args) {
   //     List<Int> list = new ArrayList<>();
         ArrayListDiffMethod obj = new ArrayListDiffMethod();
         List list = obj.getArrayList(10, 20, 50, 20);
      //   System.out.println(list);
       //  System.out.println(obj.getSize(list));
        /* obj.getElementIndex(list, 3);
         System.out.println("Iterate using for loop");
         obj.iterateUsingForLoop(list);
         System.out.println("Iterate using for each loop");
         obj.iterateUsingForEachLoop(list);
         System.out.println("Iterate using List iterator");
         obj.iterateUsingListIterator(list);
         System.out.println("Lambda expression");
         obj.iterationUsingLambda(list);
*/
         // sort the elements
       //  Collections.sort(list);
         System.out.println(list);
         System.out.println(list.contains(50));
         // To check the specific elements exists in the list
         System.out.println(list.indexOf(20));
         // return the first matching index
         System.out.println(list.lastIndexOf(20));
         // return the last matching index value
         System.out.println(list.indexOf(10));

    }
}
