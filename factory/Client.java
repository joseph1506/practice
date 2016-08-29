package practice.factory;

public class Client {

    public static void main(String args[]){
         Product product=ProductFactory.createProduct("Product");
        System.out.println("Product Name--->"+product.getProductName());
    }

}
