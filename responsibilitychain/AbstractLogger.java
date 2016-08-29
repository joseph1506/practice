package practice.responsibilitychain;

public abstract class AbstractLogger {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    protected int level;
    protected AbstractLogger nextLogger;

    public void logMessage(int level,String message){
        if(this.level<=level){
            write(message);
        }
        if(this.nextLogger!=null){
            nextLogger.logMessage(level,message);
        }
    }

    protected abstract void write(String message);

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
}
