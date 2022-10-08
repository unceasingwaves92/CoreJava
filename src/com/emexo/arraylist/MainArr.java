package com.emexo.arraylist;

import java.util.List;

public class MainArr {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        try {
            List<String> list = obj.getArray("Chennai", "Bangalore", "Punjab");
            System.out.println(list.get(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
