package practice.decorator;

public abstract class Beverage {
    String description="Base";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
