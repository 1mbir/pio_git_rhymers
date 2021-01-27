package edu.kis.vh.nursery.stack;

/**
 * @author Mikołaj Imbor
 *
 * class implementing array stack
 */
public class IntArrayStack implements StackList {
    private static final int CAPACITY = 12;
    private static final int INITIAL = -1;
    private static final int IF_EMPTY = 0;

    private final int[] numbers = new int[CAPACITY];
    private int total = INITIAL;

    /**
     * @param in number to add
     */
    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * @return total quantity of numbers
     */
    @Override
    public int getTotal() {
        return total;
    }

    /**
     * @return true if table is callable, else return false
     */
    @Override
    public boolean isEmpty() {
        return getTotal() == INITIAL;
    }

    /**
     * @return true if table is full, else return false
     */
    @Override
    public boolean isFull() {
        return getTotal() == CAPACITY - 1;
    }

    /**
     * @return last number added
     */
    @Override
    public int top() {
        if (isEmpty())
            return IF_EMPTY;
        return numbers[getTotal()];
    }

    /**
     * @return last number added and deletes it from table
     */
    @Override
    public int pop() {
        if (isEmpty())
            return IF_EMPTY;
        return numbers[total--];
    }
}
