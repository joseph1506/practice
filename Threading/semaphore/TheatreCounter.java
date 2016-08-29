package practice.Threading.semaphore;

public class TheatreCounter {

    public void provideTicket() throws InterruptedException {
        System.out.println("Counter blocked by --->"+Thread.currentThread().getName());
        Thread.sleep(10000);
        System.out.println("Counter Gave ticket to --->"+Thread.currentThread().getName());
    }


}
