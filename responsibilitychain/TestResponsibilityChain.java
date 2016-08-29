package practice.responsibilitychain;

public class TestResponsibilityChain {

    public static void main(String args[]){
        AbstractLogger consoleLogger= new ConsoleLogger(1);
        AbstractLogger fileLogger= new FileLogger(3);
        AbstractLogger dbLogger= new DBLogger(3);

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(dbLogger);

        consoleLogger.logMessage(AbstractLogger.INFO,"INFO Message");
        consoleLogger.logMessage(AbstractLogger.DEBUG,"DEBUG Message");
        consoleLogger.logMessage(AbstractLogger.ERROR,"ERROR Message");
    }


}
