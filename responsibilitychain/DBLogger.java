package practice.responsibilitychain;

public class DBLogger extends AbstractLogger {

    public DBLogger(int level) {
        this.level=level;
    }

    @Override
    protected void write(String message) {
       System.out.println("Logging to Database--->"+message);
    }
}
