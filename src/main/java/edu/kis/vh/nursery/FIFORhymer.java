package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.StackList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    //private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
    private final StackList temp = new IntArrayStack();

    public FIFORhymer() {
        super();
    }

    @Override
    public int countOut() {
        while (!callCheck())

            getTemp().push(super.countOut());

        int ret = getTemp().pop();

        while (!getTemp().isEmpty())

            countIn(getTemp().pop());

        return ret;
    }

    public StackList getTemp() {
        return temp;
    }
}
