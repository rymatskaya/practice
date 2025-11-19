package by.task13.exception;

public class NotCorrectPasswordException extends RuntimeException{
    public NotCorrectPasswordException(String message) {
        super(message);
    }
}
