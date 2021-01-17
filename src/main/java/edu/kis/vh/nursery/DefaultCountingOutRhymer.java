package edu.kis.vh.nursery;

/**
 * @author Mikołaj Imbor
 *
 * class implementing counting out rhymer
 */
public class DefaultCountingOutRhymer {
    private static final int CAPACITY = 12;
    private static final int INITIAL = -1;
    private static final int IF_EMPTY = -1;

    private final int[] numbers = new int[CAPACITY];
    private int total = INITIAL;

    /**
     * @param in number to add
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * @return total quantity of numbers
     */
    public int getTotal() {
        return total;
    }

    /**
     * @return true if table is callable, else return false
     */
    public boolean callCheck() {
        return getTotal() == INITIAL;
    }

    /**
     * @return true if table is full, else return false
     */
    public boolean isFull() {
        return getTotal() == CAPACITY - 1;
    }

    /**
     * @return last number added
     */
    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[getTotal()];
    }

    /**
     * @return last number added and deletes it from table
     */
    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }
}
