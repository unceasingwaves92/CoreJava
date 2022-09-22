package com.emexo.Loop;

public class ForLoopExample2 {

    public void forLoop(int n) {
        for (double i = 0.5; i <= n; i++) {
            for (double j=i; j<n; j++) {
                System.out.print(" ");
            }
          // for(double j=0.5*(n-i);j>0;j--){
           //     System.out.print(" ");
           // }
            for (int k=1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
