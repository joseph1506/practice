package practice.Threading.semaphore;

import java.util.concurrent.Semaphore;

public class TestAudience {

    public static void main(String args[]){
        TheatreCounter ticketCounter= new TheatreCounter();
        Semaphore semaphore=new Semaphore(1);

        Thread person1= new Thread(new Audience(ticketCounter,semaphore),"Person1");
        Thread person2= new Thread(new Audience(ticketCounter,semaphore),"Person2");
        Thread person3= new Thread(new Audience(ticketCounter,semaphore),"Person3");

        person1.start();
        person2.start();
        person3.start();
    }



}
