package practice.Threading.threadLocal;

public class TestSeatAllocator {


    public static void main(String args[]){
        Theatre theatre=new Theatre();

        Thread person1= new Thread(new Audience(theatre),"Person1");
        Thread person2= new Thread(new Audience(theatre),"Person2");
        Thread person3= new Thread(new Audience(theatre),"Person3");

        person1.start();
        person2.start();
        person3.start();


    }


}
