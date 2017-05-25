package com.source.it.lecture5.examples.queue;

public class QueueNodeTest {
    public static void main(String[] args) {
        NodeQueueWrapper queue = new NodeQueueWrapper(new QueueNode(1));
        queue.addNode(new QueueNode(2));
        queue.addNode(new QueueNode(5));
        queue.addNode(new QueueNode(7));
        queue.printQueue();
        queue.printQueueRecurcive();
        //queue.addNode(2,new QueueNode(6));
        System.out.println(queue.size);
        queue.remove(3);
        queue.printQueue();



        //System.out.println(queue.getHead().getValue());
        //queue.printQueue();

        //System.out.println(queue.getHead().getValue());
        //queue.printQueue();
/*
        System.out.println(queue.getHead().getValue());
        queue.printQueue();*/



    }
}
