package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer tempRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            tempRhymer.countIn(super.countOut());

        int returnValue = tempRhymer.countOut();

        while (!tempRhymer.callCheck())
            countIn(tempRhymer.countOut());

        return returnValue;
    }
}
