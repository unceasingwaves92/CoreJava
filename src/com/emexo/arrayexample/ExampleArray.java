package com.emexo.arrayexample;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.Collections;

public class ExampleArray {

    public void getSingleDimenArray(){
        int[] input = {10, 20, 30, 40, 50};
        input[0] = 10;
        input[1] = 20;
        input[2] = 30;
        input[3] = 40;
        input[4] = 50;
      //  System.out.println(input[1]);
    //    for(Integer data: input){
       //     System.out.println(data);
           Arrays.stream(input).forEach(inputs-> System.out.println(inputs));
    }

    public void getSingleDimensionAnotherMethod(){
        String[] array = new String[3];
        array[0] = "Karthik";
        array[1] = "Regu";
        array[2] = "Ranjana";
        Arrays.stream(array).forEach(System.out::println);
    }

    public void getMultiDimensional(){
        int[][] array = new int[2][3];
        array[0][0] = 100;
        array[0][1] = 200;
        array[0][2] = 300;
        array[1][0] = 400;
        array[1][1] = 500;
        array[1][2] = 600;
        System.out.println(array[1][2]);
    }

    public void getMultiDimensionalMethod(){
        int[][] input = {
                {10, 20},
                {40, 50},
                {60, 80}
        };
        System.out.println(input[1][0]);
    }
}
