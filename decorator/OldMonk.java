package practice.decorator;

public class OldMonk extends Beverage {

    public OldMonk(){
        this.description="Old Monk";
    }

    @Override
    public double getCost() {
        return 30;
    }
}
