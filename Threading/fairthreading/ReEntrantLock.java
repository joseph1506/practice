package practice.Threading.fairthreading;

public class ReEntrantLock {
    private boolean isLocked=false;
    private Thread lockingThread=null;
    private int lockCount=0;

    public synchronized void lock() throws InterruptedException {
       while(!isLocked && lockingThread!=Thread.currentThread()){
            wait();
        }
        isLocked=true;
        lockCount++;
        lockingThread=Thread.currentThread();
    }

    public synchronized void unlock() {
        if(lockingThread!=Thread.currentThread()){
            throw new IllegalMonitorStateException("Called Thread is not having the lock");
        }
        lockCount--;
        if(lockCount==0){
            isLocked=false;
            lockingThread=null;
            notify();
        }

    }
}
