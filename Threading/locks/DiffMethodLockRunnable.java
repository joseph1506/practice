package practice.Threading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DiffMethodLockRunnable implements Runnable{
    private Lock lock;

    public DiffMethodLockRunnable(Lock lock){
        this.lock=lock;
    }


    @Override
    public void run() {
        System.out.println("Start--->"+Thread.currentThread().getName());
        lockMethod();
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        unlockMethod();
        System.out.println("End--->"+Thread.currentThread().getName());
    }


    public void lockMethod(){
        lock.lock();
        System.out.println("Locked by--->"+Thread.currentThread().getName());
    }

    public void unlockMethod(){
        System.out.println("Unlocked by--->"+Thread.currentThread().getName());
        lock.unlock();
    }


    public static void main(String[] args) {
        Lock lock= new ReentrantLock(true);

        Thread t1=new Thread(new DiffMethodLockRunnable(lock),"Thread1");
        Thread t2=new Thread(new DiffMethodLockRunnable(lock),"Thread2");

        t1.start();
        t2.start();
    }



}


