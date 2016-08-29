package practice.springbeanwiring.serviceLocator;

public class ParserBean {
    public IParserFactory parseFactory;

    public IParserFactory getParseFactory() {
        return parseFactory;
    }

    public void setParseFactory(IParserFactory parseFactory) {
        this.parseFactory = parseFactory;
    }

    public void testParser(){
        IParser parser=parseFactory.getParser("jsonParser");
        parser.parse();

        IParser parserXML=parseFactory.getParser("xmlParser");
        parserXML.parse();
    }
}
