package practice.springbeanwiring.serviceLocator;

public interface IParserFactory {
    public IParser getParser(String parser);
}
