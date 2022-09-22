package com.emexo.LoopExample;

public class Pyramid {

    public void Pyramid(int n){

        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
           // for(int j=0;j<i;j++){
             //   System.out.print("*");
            //}
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
