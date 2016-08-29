package practice.factory.factorymethod;

public abstract class Creator {
    public abstract Product createProduct();
    public Product getProduct(){
        return createProduct();
    }
}
