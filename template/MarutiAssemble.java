package practice.template;

public class MarutiAssemble extends AssembleCar{
    @Override
    protected void otherMiscellaneous() {
        System.out.println();
    }

    @Override
    protected void putTyresAndFillAir() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void putEngine() {
        System.out.println("800 cc engine into the body...giving life ");
    }

    @Override
    protected void fitFrames() {
        System.out.println("Smaller frame for Maruti 800 car");
    }
}
