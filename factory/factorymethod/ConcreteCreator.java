package practice.factory.factorymethod;

public class ConcreteCreator extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
