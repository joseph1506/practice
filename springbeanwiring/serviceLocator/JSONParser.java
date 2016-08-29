package practice.springbeanwiring.serviceLocator;

public class JSONParser implements IParser{
    @Override
    public void parse() {
        System.out.println("JSON Decoded");
    }
}
