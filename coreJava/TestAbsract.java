package practice.coreJava;

public class TestAbsract {

    public static void main(String args[]){
        Animal cow=new Cow();
        Animal tiger=new Tiger();

        cow.makeSound();
        cow.eat();

        tiger.makeSound();
        tiger.eat();

    }


}
