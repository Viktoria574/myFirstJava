package lab29;

public class OrderAlreadyAddedException extends Exception{
    public OrderAlreadyAddedException(String message) {
        super(message);
    }
}
