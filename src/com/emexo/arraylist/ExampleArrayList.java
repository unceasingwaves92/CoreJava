package com.emexo.arraylist;

import java.util.*;

public class ExampleArrayList {

    // first approach
    public List<String> addElements(String input1, String input2, String input3, String input4, String input5) {
        ArrayList<String> list = null;
        try {
            list = new ArrayList<>();
            list.add(input1);
            list.add(input2);
            list.add(input3);
            list.add(input4);
            list.add(input5);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return list;

    }

    // convert Array to arraylist
    public List<String> addElementsFromArray(String... data){
        List<String> list = Arrays.asList(data);
        return list;
    }

    // second approach

     public void getElements(List<String> list){
        list.get(0);
       // return list;

        }

     // third approach
     public void getCollection(List<String> list) {
         // dependency added pom.xml
         // if(CollectionsUtils.isNotEmpty(list)){
         for (String data : list) {
             System.out.println(data);
         }
     }
     // fourth approach
     public void getElementForLoop(List<String> list){
            for(int i=0; i<list.size();i++){
                System.out.println(list.get(i));
            }

     }

     // fifth approach ->Forward direction
    public void getElementByIterator(List<String> list){
        Iterator<String> iterator = list.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
    }

    // sixth approach ->Forward and backward direction

    public void getElementByListIterator(List<String> list){
        ListIterator<String> listIterator = list.listIterator();
            while(listIterator.hasNext()){
                System.out.println(listIterator.next());
            }

        System.out.println("************************");

            while(listIterator.hasPrevious()) {
                System.out.println(listIterator.previous());
            }
    }

    // seventh approach
    // Java 8 onwards support Lambda expression

    public void getElementByLambdaExpression(List<String> list){
        list.forEach(data-> System.out.println(data));
    }

    // Eight approach
    // Index value->either first matching or last matching index
    public int getIndexValue(List<String> list, String input){
        int index = list.lastIndexOf(input);
        return index;
    }

    // ninth approach
    public boolean getContainsValue(List<String> list, String input){
        boolean response = list.contains(input);
        return response;
    }

}
