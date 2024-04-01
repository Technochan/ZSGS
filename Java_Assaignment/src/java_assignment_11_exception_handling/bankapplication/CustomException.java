package java_assignment_11_exception_handling.bankapplication;

public class CustomException extends Exception{
    public CustomException(String message) {
        super(message);
    }
}

class InvalidPinException extends CustomException {
    public InvalidPinException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends CustomException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
