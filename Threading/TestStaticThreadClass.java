package practice.Threading;

public class TestStaticThreadClass {


    public static void main(String args[]){
        StaticThreadClass object1= new StaticThreadClass();
        StaticThreadClass object2= new StaticThreadClass();

        Thread t1= new Thread(object1,"First Thread");
        Thread t2= new Thread(object1,"Second Thread");

        t1.start();
        t2.start();
    }



}
