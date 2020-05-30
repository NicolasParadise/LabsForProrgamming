package by.bsu.airline.exception;

public class NotNegativeException extends Exception {
    public NotNegativeException(){
        super();
    }
    public NotNegativeException(String message, Throwable exception){
        super(message,exception);
    }
    public NotNegativeException(String message){
        super(message);
    }
    public NotNegativeException(Throwable exception){
        super(exception);
    }
}