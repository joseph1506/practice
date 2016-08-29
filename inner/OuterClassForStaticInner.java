package practice.inner;

public class OuterClassForStaticInner {
    private static int staticNumber;

    public void outerMethod(){
        int numberOuter=0;
        System.out.println("Outer Method");
        class MethodLocalClass{
            public void methodLocal(){
                System.out.println("inside method local");
            }
        }
        //numberOuter++;
        MethodLocalClass methodLocalObject= new MethodLocalClass();
        methodLocalObject.methodLocal();
    }

    static class StaticInner{
        private int innerNormalInt=0;
        private static int innerStaticInt=4;
        public void goStatic(){
            System.out.println("Static Inner Class"+innerNormalInt);
        }
    }
    class NormalInner{
        public void goNormal(){
            System.out.println("Normal Inner Class");
            OuterClassForStaticInner.this.outerMethod();
        }
    }

    public Pizza createPizza(){
        return new Pizza(){
            public void make(){
                System.out.println("Ham Baked Pizza");
                this.eat();
            }
            public void eat(){
                System.out.println("Eating Ham Baked Pizza");
            }
        };
    }


}
