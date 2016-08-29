package practice.Threading.executor;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {
   public static void main(String args[]){
       Random random=new Random();
       ExecutorService executorService= Executors.newFixedThreadPool(3);
       //ExecutorService executorService= Executors.newCachedThreadPool();
       //ExecutorService executorService= Executors.newSingleThreadExecutor();
       int waitTime=600;
       for(int count=1;count<15;count++){
           int time=random.nextInt(500);
           waitTime+=time;
           Runnable runner= new PrintName("Printer"+count,time);
           //System.out.println("Adding: " + "Printer"+count + " / " + time);
           executorService.execute(runner);
       }
       try {
           Thread.sleep(waitTime);
           executorService.shutdown();
           executorService.awaitTermination(waitTime, TimeUnit.MILLISECONDS);
       } catch (InterruptedException e) {
           e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
       }
       System.exit(0);
   }
}
