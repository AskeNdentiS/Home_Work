package com.source.it.lecture5.examples.stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack() {{
            System.out.println(pop());
            print();
            push(1);
            push(5);
            push(10);
            push(17);
            push(33);
            //ToDo : and this will not work
            push(179);
            push(177);
            push(175);
            push(174);
            push(173);
            push(179);
            push(345);
            push(234);
        }};
        stack.print();
        System.out.println("Peeking " + stack.peek());
        System.out.println("Popping " + stack.pop());
        System.out.println("Popping " + stack.pop());
        stack.print();
    }
}
