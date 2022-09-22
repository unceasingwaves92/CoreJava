package com.emexo.array;

public class ArrayExample {

    // Creating an array to use that array
    // single dimensional
    public void test() {
        int[] array = new int[5];
        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 400;
     //   System.out.println(array[2]);

        //return array;
    }

    // creating an array to initialize the object
    // Single dimensional
    public void test1() {
        int[] input = {1, 3, 5, 6, 7, 9};
        for (int i = 0; i < 6; i++) {
            System.out.println(input[i]);
        }
        System.out.println(input.length);
    }

    public void sample() {

        // single dimensional
        int[] input = {10, 20, 30, 40, 50, 60};

        // multiple dimensional
        int[][] sample = new int[3][5];
        sample[0][0] = 100;
        sample[0][1] = 200;
        sample[0][2] = 3;
        sample[0][3] = 4;
        sample[0][4] = 5;
        sample[1][0] = 400;
        sample[1][1] = 500;
        sample[1][2] = 9;
        sample[1][3] = 0;
        sample[1][4] = 2;
        sample[2][0] = 10;
        sample[2][1] = 11;
        sample[2][2] = 22;
        sample[2][3] = 33;
        sample[2][4] = 44;

        System.out.println(input[3]);
        System.out.println(sample[1][4]);
        System.out.println(sample[0][4]);
        System.out.println(sample[2][1]);

    }

    // multidimensional
    public void test2() {
        int[][] out = new int[3][5];
        out[0][0] = 1;
        out[0][1] = 10;
        out[0][2] = 20;
        System.out.println(out[0][2]);

    }

    // multidimensional
    // To initialize the array
    public void test3() {
        int[][] array = {{12, 22},
                {45, 87}, {34, 56}};

        System.out.println(array.length);
        System.out.println(array[2][1]);
        System.out.println(array[2][0]);
    }

    public void testsample() {
        int[][]arr = { { 1, 2 }, { 3, 4 }, {5, 6} };

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                //for (int z = 0; z < 2; z++)
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j]);
    }


}

