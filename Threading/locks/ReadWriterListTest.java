package practice.Threading.locks;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ReadWriterListTest {


    public static void main(String[] args) {
        ExecutorService executor= Executors.newCachedThreadPool();
        ReadWriterList<Integer> list= new ReadWriterList<Integer>(100);

        for(int i=0;i<20;i++){
            executor.execute(new Reader(list));
        }

        for(int i=0;i<5;i++){
            executor.execute(new Writer(list));
        }
    }

}

class Writer implements Runnable{
    ReadWriterList<Integer> list;
    private Random rand = new Random(47);

    public Writer(ReadWriterList<Integer> list) {
        this.list=list;
    }

    @Override
    public void run() {
           try {
              for(int i=0;i<20;i++){
                    list.set(i,rand.nextInt());
                    TimeUnit.SECONDS.sleep(30);
              }
           } catch (InterruptedException e) {
               e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
           }

        System.out.println("Writer finished");
    }
}

class Reader implements Runnable{
    ReadWriterList<Integer> list;

    public Reader(ReadWriterList<Integer> list) {
        this.list=list;
    }

    @Override
    public void run() {
        try{
               while(!Thread.interrupted()){
                   for(int i=0;i<20;i++){
                       list.get(i);
                       TimeUnit.SECONDS.sleep(5);
                   }
               }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
