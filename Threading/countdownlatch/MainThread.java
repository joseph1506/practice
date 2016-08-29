package practice.Threading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MainThread {

    public static void main(String args[]){
        CountDownLatch latch= new CountDownLatch(3);

        Thread t1= new Thread(new LatchProcess("ProcessOne",2000,latch));
        Thread t2= new Thread(new LatchProcess("ProcessTwo",5000,latch));
        Thread t3= new Thread(new LatchProcess("ProcessThree",10000,latch));

        t1.start();
        t2.start();
        t3.start();


        try {
            latch.await();
            System.out.println("All Process UP");
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

}
