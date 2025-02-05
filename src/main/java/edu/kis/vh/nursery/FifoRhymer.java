package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

<<<<<<< HEAD:src/main/java/edu/kis/vh/nursery/FIFORhymer.java
    public defaultCountingOutRhymer tempRhymer = new defaultCountingOutRhymer();
=======
    public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
>>>>>>> 5f67392 (4.1 Fix class names):src/main/java/edu/kis/vh/nursery/FifoRhymer.java

    @Override
    public int countOut() {
        while (!callCheck())
            tempRhymer.countIn(super.countOut());

        int ret = tempRhymer.countOut();

        while (!tempRhymer.callCheck())
            countIn(tempRhymer.countOut());

        return ret;
    }
}
