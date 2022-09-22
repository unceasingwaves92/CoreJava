package com.emexo.Loop;

public class ForLoopExample {

    public void forLoop(int input) {

        for (int i = 1; i <= input; i++) {
            System.out.println("The loop value is: " + i);
        }
    }

    public void forLoopEx(int input) {
        for (int i = input; i > 0; i--) {
            System.out.println("The loop value example is: " + i);
        }
    }

    public void forLoopExPyramid(int input) {
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
        public void forLoopExPyramid1 ( int input){
            for (int i = 1; i <= input; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }

        }
    }

