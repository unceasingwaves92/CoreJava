package com.emexo.exceptionexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FinalException {

       public void read()  {

           try(Scanner scanner = new Scanner(new File("E:\\Full Stack Development\\input1.txt"));){
                   while(scanner.hasNext()){
                   System.out.println(scanner.nextLine());
                  // throw new CustomException();
               }
                   // Checked hiearchy
           }catch(ArithmeticException | FileNotFoundException e) {
               e.printStackTrace();
           }
       }
}
