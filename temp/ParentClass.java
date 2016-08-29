package practice.temp;


public class ParentClass {

    public static void main(String args[]){
        new B();
        new B();

    }
}


class A{
    static {
        System.out.println("A s");
    }
    A(){
        System.out.println("A1");
    }
    {
        System.out.println("A2");
    }
}

class B extends A{
    static{
        System.out.println("B s");
    }

    B(){
        System.out.println("B1");
    }
    {
        System.out.println("B2");
    }
}
