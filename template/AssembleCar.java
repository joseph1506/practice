package practice.template;

public abstract class AssembleCar {
    public void assemble(){
        fitFrames();
        putEngine();
        putTyresAndFillAir();
        otherMiscellaneous();
        if(isPetrolLow()){
            fillTwoLitrePetrol();
        }
        testDriveCar();
    }

    private void testDriveCar() {
        System.out.println("Driving....");
    }

    private void fillTwoLitrePetrol() {
        System.out.println("Filling 2 litres petrol");
    }

    private boolean isPetrolLow() {
        return true;
    }

    protected abstract void otherMiscellaneous();

    protected abstract void putTyresAndFillAir();

    protected abstract void putEngine();

    protected abstract void fitFrames();



}
