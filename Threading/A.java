package practice.Threading;

public class A {
    public static String method(){
        return "12";
    }

   /*public static void main(String args[]){
        A a= new B();
        a.method();
    }*/

    public static void main(String args[]){
        A a= new B();
        System.out.println(a.method());
    }

}

class B extends A{
    public static String method(){
        return "23";
    }


}
