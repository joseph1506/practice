package practice.Threading;

public class RacerDemo {
    public static void main(String args[]){
        Runnable runner=new Racer();
        Thread hare= new Thread(runner,"Hare");
        Thread tortoise= new Thread(runner,"Tortoise");
        hare.start();
        tortoise.start();
    }


}
