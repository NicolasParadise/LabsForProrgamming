package by.bsu.circlePoint.Data;

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
}
