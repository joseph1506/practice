package practice.inner;

public class TestOuterClassForStaticInner {

    public static void main(String args[]){
        OuterClassForStaticInner.NormalInner normalInner=(new OuterClassForStaticInner()).new NormalInner();
        normalInner.goNormal();
        OuterClassForStaticInner.StaticInner staticInner=new OuterClassForStaticInner.StaticInner();
        staticInner.goStatic();

        Pizza hamBakedPizza=new Pizza(){
            public void make(){
                System.out.println("Ham Baked Pizza");
                this.eat();
            }
            public void eat(){
                System.out.println("Eating Ham Baked Pizza");
            }
        };

        hamBakedPizza.make();
    }
}
