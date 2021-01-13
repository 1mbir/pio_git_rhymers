package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    private static final int total_rj_start = 0;
    int totalRejected = total_rj_start;

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
