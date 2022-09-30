package com.emexo.collections1;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {

    public List<String> getArray(String input, String input1, String input2) throws CustomException{
        List<String> list = null;
        try {
            list = new ArrayList<>();
            list.add(input);
            list.add(input1);
            list.add(input2);
            throw new CustomException();

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Ended array list");
        }
        return list;
    }
}
