package practice.Threading.locks;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriterList<T> {
    private ArrayList<T> lockedList;
    private ReentrantReadWriteLock lock= new ReentrantReadWriteLock();

    public ReadWriterList() {
        this.lockedList = new ArrayList<T>();
    }

    public ReadWriterList(int size) {
        this.lockedList = new ArrayList<T>(size);
    }

    public T set(int index,T element){
        lock.writeLock().lock();
        try{
            return lockedList.set(index,element);
        }   finally {
            lock.writeLock().unlock();
        }
    }

    public T get(int index){
        lock.readLock().lock();
        try{
            if(lock.getReadLockCount() > 1)
                System.out.println(lock.getReadLockCount());
            return lockedList.get(index);
        } finally {
            lock.readLock().unlock();
        }
    }


}
