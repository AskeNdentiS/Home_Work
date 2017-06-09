package com.source.it.lecture9.exemples.homework.callcentre;


import SourceITHomeWork.lecture9.examples.callcentre.impl.Call;
import SourceITHomeWork.lecture9.examples.callcentre.impl.CallCentre;
import SourceITHomeWork.lecture9.examples.callcentre.impl.CallsDto;


import java.util.*;

public class CallCentreTest2 {
    private static final int TOTAL_CALLS = 10;
    private static final String OPERATOR = "Operator";

    public static void main(String[] args) {
        List<CallsDto> calls = new ArrayList<>(/*TOTAL_CALLS*/);// ToDo : choose collection impl

        for (int i = 0; i < TOTAL_CALLS; i++) {
            calls.add(CallCentre.produceCallDto());
        }
        //System.out.println(Arrays.toString(calls.toArray()));
        List<Integer> durations = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        List<Integer> durationsCall = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Set<String> operators = new HashSet<>();/*(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o1Number = o1.substring(OPERATOR.length());
                int o1IntNumber = Integer.parseInt(o1Number);
                String o2Number = o2.substring(OPERATOR.length());
                int o2IntNumber = Integer.parseInt(o2Number);
                return o1IntNumber - o2IntNumber;
            }
        });*/
        Map<String,Integer> maps = new HashMap<String,Integer>();


            for (CallsDto call : calls) {
            int current = call.getSummaryCallsDuration();
            int callsQuantity = call.getCallsQuantity();
            String operator = call.getOperator();
            operators.add(operator);
            String operatorNumber = operator.substring(OPERATOR.length());
            int durationIndex = Integer.parseInt(operatorNumber) - 1;
            durations.set(durationIndex, current + durations.get(durationIndex));
            durationsCall.set(durationIndex, callsQuantity + durationsCall.get(durationIndex));

        }
        for (String operator : operators) {
            String operatorNumber = operator.substring(OPERATOR.length());
            int durationIndex = Integer.parseInt(operatorNumber) - 1;
            System.out.println("Operator " + operator + " talked for " + durations.get(durationIndex) + " Calls  " + durationsCall.get(durationIndex));
        }
    }
}
