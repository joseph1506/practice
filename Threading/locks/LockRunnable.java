package practice.Threading.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class LockRunnable implements Runnable{
    private Lock lock;

    public LockRunnable(Lock lock){
       this.lock=lock;
    }


    @Override
    public void run() {
        System.out.println("trying for Lock for Thread--->"+Thread.currentThread().getName());
        try {
            if(lock.tryLock(60, TimeUnit.SECONDS)){
                System.out.println("Acquired Lock for Thread--->"+Thread.currentThread().getName());
                System.out.println("1 minute Sleep Started+++++ "+Thread.currentThread().getName());
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
                System.out.println("1 minute Sleep Ended+++++ "+Thread.currentThread().getName());
                System.out.println("Releasing Lock Thread Ended--->"+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            lock.unlock();
        }
    }
}
