package practice.coreJava;

public class ParentClass {
    int number=10;

    public void printNumber(){
        System.out.println("inside Parent");
        System.out.println(number);
    }

}


class ChildClass extends ParentClass{
    int number=20;

    public void printNumber(){
        System.out.println("inside Child");
        System.out.println(number);
    }

}
