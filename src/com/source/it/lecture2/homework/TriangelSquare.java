package com.source.it.lecture2.homework;

public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        float length = 0;
        float square = 0;

        /*your code here*/

        square = (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2))/2;

         double lengthX1X2 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

             double lengthX1X3 = Math.sqrt(Math.pow((x3 - x1),2) + Math.pow((y3 - y1),2));

                double lengthX2X3 = Math.sqrt(Math.pow((x3 - x2),2) + Math.pow((y3 - y2),2));

        length = (float) lengthX1X2 + (float) lengthX1X3 + (float) lengthX2X3;


        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
}
