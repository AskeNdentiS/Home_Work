package com.source.it.lecture3.homework;

import java.util.Arrays;

public class MatrixMultiplier {
    public static void main(String[] args) {
        int[][] first = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1},
                {4, 5, 6, 3}
        };

        int[][] second = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 5, 1},
                {3, 4, 6}
        };
        int indexA = first.length;
        int indexB = second[0].length;
        int[][] firstSecond = new int[indexA][indexB];

        for (int a = 0; a < indexA; a++) {
            for (int b = 0; b < indexB; b++) {
                for (int c = 0; c < second.length; c++) {
                    firstSecond[a][b] += first[a][c] * second[c][b];
                }
            }
        }

        for (int[] array : firstSecond) {
            System.out.println(Arrays.toString(array));
        }
    }
}
