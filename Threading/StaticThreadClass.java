package practice.Threading;

public class StaticThreadClass implements Runnable {
    public static String volatileString="";

    //public Object lock = new Object();

    public static void modifyVolatileString(String threadName){
        //synchronized (StaticThreadClass.class){
            volatileString=" modified by "+threadName;
        //}
    }

    @Override
    public void run() {
        //synchronized(StaticThreadClass.class){
        synchronized (this){
            StaticThreadClass.modifyVolatileString(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() +"----->"+StaticThreadClass.volatileString);
            System.out.println(Thread.currentThread().getName() +"sleeping starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            System.out.println(Thread.currentThread().getName() +"sleeping ends");
            System.out.println("After Sleep "+Thread.currentThread().getName() +"----->"+StaticThreadClass.volatileString);
        }
        //}
    }
}
