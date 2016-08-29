package practice.coreJava;

public class TestParent {

    public static void main(String args[]){
        ParentClass instance= new ChildClass();
        System.out.println(instance.number);
        instance.printNumber();
    }


}
