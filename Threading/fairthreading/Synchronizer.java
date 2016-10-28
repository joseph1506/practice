package practice.Threading.fairthreading;

public class Synchronizer {
    Lock lock=null;

    public Synchronizer(Lock lock) {
        this.lock = lock;
    }

    public void performSomething(){
        this.lock.lock();

        this.lock.unlock();
    }
}
