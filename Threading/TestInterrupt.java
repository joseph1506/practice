package practice.Threading;

public class TestInterrupt {

    public static void main(String args[]) throws InterruptedException {
        Thread thread= new Thread(new MyDaemonThread("Daemon"));
        thread.start();

        System.out.println("Main Thread Sleeping for 5 seconds");
        Thread.sleep(2000);

        System.out.println(Thread.currentThread().getName()+" Interrupting thread");
        thread.interrupt();
    }


    private static class MyDaemonThread implements Runnable {
        private MyDaemonThread(String name) {
            super();
        }

        @Override
        public void run() {
            try {
                System.out.println("My Thread Sleeping for 10 seconds");
                Thread.sleep(10000);
                System.out.println("my thread sleeping over");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" interrupted");
            }
        }
    }
}
