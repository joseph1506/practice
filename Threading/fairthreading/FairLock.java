package practice.Threading.fairthreading;

import java.util.ArrayList;
import java.util.List;

public class FairLock {
    private boolean isLocked=false;
    private Thread lockingThread=null;
    private List<QueueObject> waitingThreads= new ArrayList<QueueObject>();

    public void lock(){
        QueueObject queueObject= new QueueObject();
        boolean isLockedForThisThread=true;
        synchronized (this){
            waitingThreads.add(queueObject);
        }

        while(isLockedForThisThread){
            synchronized (this){
                isLockedForThisThread= isLocked || waitingThreads.get(0)!=queueObject;

                if(!isLockedForThisThread){
                    isLocked=true;
                    lockingThread=Thread.currentThread();
                    waitingThreads.remove(queueObject);
                    return;
                }
            }

            try {
                queueObject.doWait();
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }

    public synchronized void unLock(){
        if(this.lockingThread!=Thread.currentThread()){
            throw new IllegalMonitorStateException("Called Thread is not having the lock");
        }

        isLocked=false;
        this.lockingThread=null;
        if(waitingThreads.size()>0){
            waitingThreads.get(0).doNotify();
        }
    }
}
