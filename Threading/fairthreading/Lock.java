package practice.Threading.fairthreading;

public class Lock {
    private boolean isLocked=false;
    private Thread lockingThread=null;

    public synchronized void lock() throws InterruptedException {
       while(!isLocked){
            wait();
        }
        isLocked=true;
        lockingThread=Thread.currentThread();
    }

    public synchronized void unlock() {
        if(lockingThread!=Thread.currentThread()){
            throw new IllegalMonitorStateException("Called Thread is not having the lock");
        }
        isLocked=false;
        lockingThread=null;
        notify();
    }
}
