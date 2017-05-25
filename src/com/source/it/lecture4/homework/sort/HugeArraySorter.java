package com.source.it.lecture4.homework.sort;

import java.util.Arrays;

public class HugeArraySorter {
    public static void main(String[] args) {
        int[] hugeArray = ArrayCreator.createHugeArray(10);

        /*Your implementation here*/

        int [] count = new int[hugeArray.length+1];
        for (int elem : hugeArray){
            count[elem]++;
        }
        int z = 0;
        for (int i = 0; i < hugeArray.length; i++){
            while ( count[i]>0){
                hugeArray[z]=i;
                z++;
                count[i]--;
            }
        }

       for (int index = 0; index < hugeArray.length - 1; index++) {
            if (hugeArray[index] > hugeArray[index + 1]) {
                System.out.println("Sort failed!!!");
                return;
            }
        }

        System.out.println("Sort successful!!");

    }
}
