package practice.template;

public class FerrariAssemble extends AssembleCar{
    @Override
    protected void otherMiscellaneous() {
        System.out.println("Paint ferrari red");
        System.out.println("Dancing horse logo installed");
        System.out.println("Fixed the sound system");
    }

    @Override
    protected void putTyresAndFillAir() {
        System.out.println("Front 235/35 ZR20 8.5");
        System.out.println("Rear  295/35 ZR20 10.5");
        System.out.println("50 and 60 psi front and rear pressure filled");
    }

    @Override
    protected void putEngine() {
         System.out.println("Putting on 4 cylinder in rail V-8 Engine.......");
    }

    @Override
    protected void fitFrames() {
        System.out.println("Ferrari Spider frame and lights on the way.");
        System.out.println("30 degree inclined spoilers fit on the body....");
        System.out.println("ferrari frame fitting over......");
    }
}
