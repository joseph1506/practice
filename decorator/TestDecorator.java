package practice.decorator;

public class TestDecorator {
    public static void main(String args[]){
        Beverage drink=new FourIceCubes(new OldMonk());
        System.out.println("Drink served--->"+drink.getDescription()+"-->Cost--->"+drink.getCost());

        Beverage drink1=new Soda(new FourIceCubes(new Teachers()));
        System.out.println("Drink served--->"+drink1.getDescription()+"-->Cost--->"+drink1.getCost());

    }


}
