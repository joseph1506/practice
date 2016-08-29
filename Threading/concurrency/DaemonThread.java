package practice.Threading.concurrency;

import java.util.concurrent.TimeUnit;

public class DaemonThread implements Runnable{

    @Override
    public void run() {
        while(true){
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println("Thread is "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() +" Interrupted" );
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for(int count=0;count<10;count++){
            Thread thread= new Thread(new DaemonThread(),"Thread"+count);
            thread.setDaemon(true);
            thread.start();
        }
        TimeUnit.MILLISECONDS.sleep(3000);
        System.out.println("Main is ending");
    }

}
