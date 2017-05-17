package com.source.it.lecture4.homework;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int fibonacci = fibonacci(8);
        System.out.println(fibonacci);
    }

    private static int fibonacci(int n) {
        if (n == 0){
            return 0;
    }
        if (n == 1){
            return 1;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }


}
