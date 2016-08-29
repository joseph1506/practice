package practice.inner;

public class OuterClass {
    private String variable1;

    public void methodForInnerClass(){
        String localVariable="method localVariable";


        class InnerClassInLocalMethod{
            String innerClassvaribale;

            public void innerClassMethod(){
              innerClassvaribale="inner class variable";
              /*System.out.println("From innerClassmethod--->"+localVariable);*/
              System.out.println("From innerClass--->"+innerClassvaribale);
            }
        }

        InnerClassInLocalMethod innerClass= new InnerClassInLocalMethod();
        innerClass.innerClassMethod();
        System.out.println("From innerClassmethod--->"+localVariable);
    }
}
