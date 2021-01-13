package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int numbers_max = 12;
    private static final int total_start = -1;

    private int[] numbers = new int[numbers_max];

    public int total = total_start;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
