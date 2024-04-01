package java_assignment_11_exception_handling.bankapplication;


public class Account {
    private double balance;
    private int pin;

    public Account(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws CustomException {
        if (amount < 0) {
            throw new CustomException("Deposit amount cannot be negative");
        }
        balance += amount;
        System.out.println("Deposited : " + amount);
    }

    public void withdraw(double amount) throws CustomException {
        if (amount < 0) {
            throw new CustomException("Withdrawal amount cannot be negative");
        }
        try {
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient Amount - You have less balance only");
            }
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }


    public void checkBalance() {
        System.out.println("Available Balance: " + balance);
    }

        public void verifyPin(int enteredPin) throws InvalidPinException {
            if (enteredPin != pin) {
                throw new InvalidPinException("Invalid PIN Access denied");
            }
        }
}
