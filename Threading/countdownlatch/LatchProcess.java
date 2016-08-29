package practice.Threading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class LatchProcess implements Runnable {
    private final String name;
    private final long timeToSleep;
    private final CountDownLatch latch;


    public LatchProcess(String name, long timeToSleep, CountDownLatch latch){
        this.name=name;
        this.timeToSleep=timeToSleep;
        this.latch=latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(timeToSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        System.out.println("Service -->"+name+"--> is up");

        latch.countDown();
    }
}
