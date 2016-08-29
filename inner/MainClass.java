package practice.inner;

public class MainClass {
    private String object1;
    private int integer1;


    static class StaticClass{
        //static MainClass mainClass;

        public static void testMethod(){
            MainClass mainClass=new MainClass();
             mainClass.object1="";
        }


    }

    class InnerClass{

    }



}
