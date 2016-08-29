package practice.generics;

import java.util.ArrayList;
import java.util.List;

public class TestWildCards {

    public void printObjects(List<? super A> items){
        for(Object item:items){
        System.out.println(((SuperA) item).getName());
        }
    }

    public void printObjectsTs(List<? extends A> items){
        for(Object item:items){
            System.out.println(((SuperA) item).getName());
        }
    }

    public static void main(String args[]){
        List<? super A> aObjects= new ArrayList<A>();
        TestWildCards test= new TestWildCards();

        A object1= new A("A object");
        B object2= new B("B object");
        A object3= new C("C object");
        SuperA superA= new SuperA("Super Object");
        aObjects.add(object1);
        aObjects.add(object2);
        //aObjects.add(object3);
        //aObjects.add(superA);
        //test.printObjects(aObjects);
        //test.printObjectsTs(aObjects);

    }
}

class SuperA{
    private String name;

    SuperA(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class A extends SuperA{
    A(String name) {
        super(name);
    }
}

class B extends A{
    B(String name) {
        super(name);
    }
}

class C extends A{
    C(String name) {
        super(name);
    }
}
