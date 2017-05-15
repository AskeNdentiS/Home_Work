package com.source.it.lecture3.homework;

public class MatrixPrinter {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2000, 3, 4},
                {3, 4, 5250, 60000000},
                {7, 5, 4, 1},
                {1, 2, 3, 4}
        };
    /* Your code here */

        for (int[] elem : array) {
            System.out.print("[ ");
            for (int elem1 = 0; elem1 < elem.length; elem1++) {
                if (elem1 == elem.length - 1) {
                    System.out.print(elem[elem1]);
                } else
                    System.out.print(elem[elem1] + ", ");
            }
            System.out.println(" ]");
            // System.out.println(Arrays.toString(elem));
        }

    }
}
