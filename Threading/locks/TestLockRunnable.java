package practice.Threading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLockRunnable {

    public static void main(String[] args) {
        Lock lock= new ReentrantLock(true);

        Thread t1=new Thread(new LockRunnable(lock),"Thread1");
        Thread t2=new Thread(new LockRunnable(lock),"Thread2");

        t1.start();
        t2.start();





    }
}
