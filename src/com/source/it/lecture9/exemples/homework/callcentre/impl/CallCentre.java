package com.source.it.lecture9.exemples.homework.callcentre.impl;

import java.util.Random;

public class CallCentre {
    private static final String OPERATOR = "Operator";
    private static Random random = new Random();

    public static Call produceCall() {
        return new Call(OPERATOR + Integer.toString(random.nextInt(10) + 1),
                random.nextInt(120) + 30);
    }
    public static CallsDto produceCallDto() {
        return new CallsDto(OPERATOR + Integer.toString(random.nextInt(10) + 1),
                random.nextInt(120) + 30,1);
    }
}
