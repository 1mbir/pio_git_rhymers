package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.StackList;

/**
 * @author Mikołaj Imbor
 *
 * class implementing counting out rhymer
 */
public class DefaultCountingOutRhymer {
    private StackList stack;

    public DefaultCountingOutRhymer(StackList stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer(){
        stack = new IntArrayStack();
    }

    /**
     * @param in number to add
     */
    public void countIn(int in) {
        stack.push(in);
    }

    /**
     * @return total quantity of numbers
     */
    public int getTotal() {
        return stack.getTotal();
    }
    /**
     * @return true if table is callable, else return false
     */
    public boolean callCheck() {
        return stack.isEmpty();
    }

    /**
     * @return true if table is full, else return false
     */
    public boolean isFull() {
        return stack.isFull();
    }

    /**
     * @return last number added
     */
    protected int peekaboo() {
        return stack.top();
    }

    /**
     * @return last number added and deletes it from table
     */
    public int countOut() {
        return stack.pop();
    }
}
