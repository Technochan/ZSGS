package java_assignmnet_13_arraylist.book_add_operation.exception_handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInput {
    public int getInput(Scanner scan) {
        int input = 0;
        try {
            input = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter Only Numeric Value");
            scan.nextLine();
            return 0;
        }
        return Math.max(input,0);
    }
}
