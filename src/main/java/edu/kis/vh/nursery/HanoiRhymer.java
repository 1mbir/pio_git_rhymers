package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    private static final int TOTAL_RJ_START = 0;
    int totalRejected = TOTAL_RJ_START;

    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
