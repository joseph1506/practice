package practice.decorator;

public class Teachers extends Beverage{

    public Teachers(){
        this.description="Teachers";
    }

    @Override
    public double getCost() {
        return 180;
    }
}
