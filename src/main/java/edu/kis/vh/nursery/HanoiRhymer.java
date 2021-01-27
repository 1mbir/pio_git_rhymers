package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    private static final int TOTAL_RJ_START = 0;
    private int totalRejected = TOTAL_RJ_START;

    public HanoiRhymer() {
        super();
    }

    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected+=1;
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

}
