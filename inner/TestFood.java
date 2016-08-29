package practice.inner;

public class TestFood {
    public static void main(String args[]){
        Food food= new Food();
        food.getVegCrustedPizza().make();
        food.getHamBakedPizza().make();

        Pizza createdPizza= new OuterClassForStaticInner().createPizza();
        System.out.println(createdPizza);

    }


}
