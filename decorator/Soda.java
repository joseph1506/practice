package practice.decorator;

public class Soda extends AddOns {
    Beverage beverage;

    public Soda(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" + 100 ml of soda";
    }

    @Override
    public double getCost() {
        return beverage.getCost()+5;
    }
}
