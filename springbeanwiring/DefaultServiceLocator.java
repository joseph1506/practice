package practice.springbeanwiring;

public class DefaultServiceLocator {
    private static PostService postService= new PostService();
    private static DeliveryService deliveryService= new DeliveryService();


    public static PostService createPostService(){
        return postService;
    }

    public static DeliveryService createDeliveryService(){
        return deliveryService;
    }
}
