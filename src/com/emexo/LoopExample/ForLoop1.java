package com.emexo.LoopExample;

public class ForLoop1 {

    public void ForLoop1(int n) {
        for(int i=1;i<=n;i++){

          //  for(int j=1*(n-i);j>=0;j--){
          //      System.out.print(" ");
           // }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

