package practice.coreJava;

public class Cow extends Animal{
    @Override
    public void eat() {
        System.out.println("I am eating grass....");
    }

    @Override
    public void makeSound() {
        System.out.println("Moooooooooooo......");
    }
}
