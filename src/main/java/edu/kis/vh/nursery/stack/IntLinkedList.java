package edu.kis.vh.nursery.stack;

public class IntLinkedList implements StackList{
    private static final int IF_EMPTY = 0;
    private int total=0;
    Node last;

    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        public Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    @Override
    public void push(int i) {
        total++;
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getTotal(){
        return total;
    }

    @Override
    public int top() {
        if (isEmpty())
            return IF_EMPTY;
        return last.getValue();
    }

    @Override
    public int pop() {
        if (isEmpty())
            return IF_EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        total--;
        return ret;
    }

}
