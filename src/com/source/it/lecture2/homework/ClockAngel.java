package com.source.it.lecture2.homework;

public class ClockAngel {
    public static void main(String[] args) {
        int hours = 3;
        int mins = 15;
        int result = 0;





        /*Your code here*/
        double gr = (hours + mins / 60.0) * 30 - mins * 6;

        /*if(gr >= 0 && gr <= 180){
            result = gr;
        }*/

        System.out.println("Angle between hours and minute narrows is " + gr);
    }
}
