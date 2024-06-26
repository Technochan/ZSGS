package SecondEvaluation.com.zsgs.lift_application.exceptionhandling;
import SecondEvaluation.com.zsgs.lift_application.erroemessage.ErrorMessage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {
    public static int getIntInput(Scanner scan) {
        int input = 0;
        while (true) {
            try {
                input = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                ErrorMessage.printErrorMessage("Input Must Be Integer");
                scan.next();
            }
        }
        return input;
    }
}
