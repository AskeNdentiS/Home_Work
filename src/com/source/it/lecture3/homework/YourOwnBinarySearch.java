package com.source.it.lecture3.homework;

public class YourOwnBinarySearch {
    static int[] array = {1, 4, 7, 10, 17, 30, 48, 50};
    static int element = 30;

    public static void main(String[] args) {
        System.out.println(binarySearch(array, element));
    }


    private static int binarySearch(int[] array, int elem) {
        int result = -1;
        /* Your code here */

        int low = 0, high = array.length, mid;

        while (low < high) {
            mid = (low + high) / 2;
            if (elem == array[mid]) {
                result = mid;
                break;
            } else {
                if (elem < array[mid]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
        }

        return result;
    }
}
