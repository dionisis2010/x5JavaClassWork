package classwork3;

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message + " new Exception");
    }
}
