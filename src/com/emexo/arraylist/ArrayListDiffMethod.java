package com.emexo.arraylist;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDiffMethod {

    /*
    ** Array list using Integer
     */

    public List<Integer> getArrayList(int input1, int input2, int input3, int input4){
        List<Integer> list = new ArrayList<>();
        list.add(input1);
        list.add(input2);
        list.add(input3);
        list.add(input4);

        return list;
    }

    /**
     * get the size of list
     */

    public int getSize(List<Integer> list){
        int size = list.size();
        return size;
    }

    /**
     * get the element index based
     */

    public void getElementIndex(List<Integer> list, int input){
        if(list!=null){
            System.out.println(list.get(input));
        }
    }

    /**
     * iterate using for loop
     */

    public void iterateUsingForLoop(List<Integer> list){
        if(list!=null){
            for(int i=0; i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
    }

    /**
     * iterate using for each loop
     */

    public void iterateUsingForEachLoop(List<Integer> list){
        if(CollectionUtils.isNotEmpty(list)){
            for(Integer data: list){
                System.out.println(data);
            }
        }
    }

    /**
     * iterate using List Iterator
     */

    public void iterateUsingListIterator(List<Integer> list){
        if(CollectionUtils.isNotEmpty(list)){
            ListIterator<Integer> listIterator = list.listIterator();
            System.out.println("Forward direction");
            while(listIterator.hasNext()){
                System.out.println(listIterator.next());
            }
            System.out.println("Backward direction");
            while(listIterator.hasPrevious()){
                System.out.println(listIterator.previous());
            }
        }
    }

    /**
     * iterate using lambda expression
     */

    public void iterationUsingLambda(List<Integer> list){
        if(CollectionUtils.isNotEmpty(list)){
            list.forEach(element-> System.out.println(element));
        }
    }
}
