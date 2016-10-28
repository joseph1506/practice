package practice.Threading.fairthreading;

public class QueueObject {
    private boolean isNotified=false;
    public void doWait() throws InterruptedException {
       while(!isNotified){
           this.wait();
       }
       this.isNotified=false;
    }

    public void doNotify() {
       this.isNotified=true;
       this.notify();
    }

    public boolean equals(Object o){
        return this==o;
    }
}
