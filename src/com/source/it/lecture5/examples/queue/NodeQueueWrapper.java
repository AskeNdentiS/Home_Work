package com.source.it.lecture5.examples.queue;

public class NodeQueueWrapper {

    private QueueNode tail;
    private QueueNode head;
     int size = 0;




    public NodeQueueWrapper(QueueNode node) {
        tail = node;
        size++;
    }



    public void addNode(QueueNode node) {
        node.setNext(tail);
        tail = node;
        size++;


    }

    public QueueNode getHead() {
        QueueNode current = tail.getNext();
        QueueNode prev = tail;
        while (current.getNext() != null) {
            current = current.getNext();
            prev = prev.getNext();
        }
        prev.setNext(null);
        return current;
    }

    public void printQueue() {
        QueueNode current = tail;
        while (current != null) {
            System.out.print(current.getValue() + " --> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public void printQueueRecurcive() {
        printRecurcive(tail);
        System.out.println("null");
    }

    private void printRecurcive(QueueNode current) {
        System.out.print(current.getValue() + " --> ");
        if (current.getNext() != null) {
            printRecurcive(current.getNext());
        }
    }

    /**
     * Removes Node from list that is located on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     **/
    public void remove(int position) {
            /*Your code here*/
        QueueNode current=tail;
        if (size == 0 || position > size){
            System.out.println("error");
        }
        int i = 0;
        while (current != null) {
            if (i == position) {
                current.setValue(0);
                current.setNext(head);
                i++;
                break;

            } else {
                i++;
                current = current.getNext();
            }
        }



    }

    /**
     * Adds Node to list on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     * @param node node should be inserted at position
     */
    public void addNode(int position, QueueNode node) {

    }

    /**
     * Gets then Node that located on the position starting from the tail (end of the list)
     * if position is more than list size - prints error message
     * @param position number of the Node starting from the tail
     * @return Node that located on the position from the tail (end of list) if position exists in list
     */
    public QueueNode getFromHead(int position) {
        /*Your code here and please remove "return null". I've put it for ability to compile code*/
        return null;
    }
}
