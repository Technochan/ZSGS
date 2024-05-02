package SecondEvaluation.com.lift_system.exceptionhandling;
import SecondEvaluation.com.lift_system.erroemessage.ErrorMessage;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {

    private static Scanner scan = new Scanner(System.in);
    public static int getIntInput() {
        int input = 0;
        while (true) {
            try {
                input = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                ErrorMessage.printErrorMessage("Input Must Be Integer");
                scan.next();
//                return 0;
            }
        }
        return input;
    }
}
