package practice.exception;

public class CustomException extends Exception{

    public CustomException(String message){
       super(message);
    }

    public CustomException(String message, Throwable thrw){
        super(message,thrw);
    }
}
