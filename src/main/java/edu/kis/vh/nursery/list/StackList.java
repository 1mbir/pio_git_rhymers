package edu.kis.vh.nursery.list;

public interface StackList {
    void push(int in);

    int getTotal();

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
