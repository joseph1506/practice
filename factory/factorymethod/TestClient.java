package practice.factory.factorymethod;

public class TestClient {

    public static void main(String[] args) {
        Creator creator= new ConcreteCreator();
        Product product=creator.getProduct();
    }

}
