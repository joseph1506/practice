package practice.decorator;

public class FourIceCubes extends AddOns{
    Beverage beverage;

    public FourIceCubes(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"+ 4 ice cubes";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double getCost() {
        return beverage.getCost()+10;
    }
}
