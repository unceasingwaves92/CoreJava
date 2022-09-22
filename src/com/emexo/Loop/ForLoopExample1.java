package com.emexo.Loop;

public class ForLoopExample1 {

    public void forLoop(int n){
        for(int i=0; i<n; i++){
            for(int j=1*(n-i);j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
