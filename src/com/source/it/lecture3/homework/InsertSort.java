package com.source.it.lecture3.homework;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {5, 7, 9, 15, 10, -1, 8};

        /*Your code here*/
        int i, j, temp;
        for (i = 1; i < array.length; i++) {
            temp = array[i];
            j = i;

            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }



        System.out.println(Arrays.toString(array));
    }
}
