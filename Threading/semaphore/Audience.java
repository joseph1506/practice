package practice.Threading.semaphore;

import java.util.concurrent.Semaphore;

public class Audience implements Runnable {
    private TheatreCounter counter;
    private Semaphore semaphore;

    public Audience(TheatreCounter counter, Semaphore semaphore) {
        this.counter = counter;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" In Queue for ticket");
        takeTicket();
        System.out.println(Thread.currentThread().getName()+" got ticket");
    }

    private void takeTicket() {
        try {
            semaphore.acquire();
            counter.provideTicket();
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        semaphore.release();
    }
}
