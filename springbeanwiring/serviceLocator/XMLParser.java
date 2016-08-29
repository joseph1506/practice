package practice.springbeanwiring.serviceLocator;

public class XMLParser implements IParser {
    @Override
    public void parse() {
        System.out.println("XML decoded");
    }
}
