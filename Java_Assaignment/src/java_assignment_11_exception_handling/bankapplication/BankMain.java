package java_assignment_11_exception_handling.bankapplication;

// Create multiple classes to imitate a bank structure with proper Exception Handling. For eg., if the user tries to withdraw more than the balance, throw "InsufficientBalanceException" (created customly)
public class BankMain {
    public static void main(String[] args) throws CustomException {
        new Bank().initialControl();
    }
}
