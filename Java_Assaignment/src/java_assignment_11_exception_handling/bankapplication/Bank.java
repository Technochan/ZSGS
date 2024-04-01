package java_assignment_11_exception_handling.bankapplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    static Scanner scanner = new Scanner(System.in);
    static Account account = new Account(10000, 123123);
    public void initialControl() throws CustomException {
        try {
            System.out.println("Enter your Account PIN:   -    Pin : 123123  | Balance : 10000");
            int enteredPin = scanner.nextInt();
            account.verifyPin(enteredPin);
            System.out.println("PIN Verified Successfully");
            loginSuccess();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input Please enter a valid PIN.");
            scanner.next();
        } catch (InvalidPinException e) {
            System.out.println(e.getMessage());
        }
    }

    public void loginSuccess() throws CustomException {
        int option = 0;
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            try {
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input Enter only Integer Value");
                scanner.next();
                continue;
            }

            switch (option) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    if (depositAmount < 0) {
                        System.out.println("Amount must be positive.");
                        continue;
                    }
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();
                    if (withdrawAmount < 0) {
                        System.out.println("Amount must be positive.");
                        continue;
                    }
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
