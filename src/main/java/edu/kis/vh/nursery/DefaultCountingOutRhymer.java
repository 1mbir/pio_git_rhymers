package edu.kis.vh.nursery;

/**
 * @author Mikołaj Imbor
 *
 * class implementing counting out rhymer
 */
public class DefaultCountingOutRhymer {
    private IntArrayStack stack;

    public DefaultCountingOutRhymer(IntArrayStack stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer(){
        stack = new IntArrayStack();
    }

    /**
     * @param in number to add
     */
    public void countIn(int in) {
        stack.countIn(in);
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
        return stack.callCheck();
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
        return stack.peekaboo();
    }

    /**
     * @return last number added and deletes it from table
     */
    public int countOut() {
        return stack.countOut();
    }
}
