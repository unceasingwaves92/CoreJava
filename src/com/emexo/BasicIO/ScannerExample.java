package com.emexo.BasicIO;

import java.util.Scanner;

public class ScannerExample {

    public void getScanner(){

        Scanner scanner = new Scanner(System.in);
      //  System.out.println(scanner.next());
      //  System.out.println(scanner.nextLine());
       // System.out.println(scanner.nextInt());
        while(scanner!=null){
            System.out.println(scanner.nextInt());
        }


    }
}
