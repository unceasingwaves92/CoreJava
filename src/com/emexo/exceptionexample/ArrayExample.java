package com.emexo.exceptionexample;

public class ArrayExample {

    public void array() throws CustomException {
        try {
            int[] array = new int[5];
            array[0] = 100;
            array[1] = 200;
            array[2] = 300;
            array[3] = 400;
            array[4] = 500;
            System.out.println(array[5]);
            throw new CustomException();
        }catch(CustomException e){
            throw new CustomException();
        }finally
        {
            System.out.println("Rest of the code is executed");
        }

    }
}
