package com.emexo.LoopExample;

public class ForLoop {

    public void ForLoop(int n) {

        for(int i=0;i<=n;i++){

            for(int j=1*(n-i);j>=0;j--){
                System.out.print("");
            }
            for(int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
