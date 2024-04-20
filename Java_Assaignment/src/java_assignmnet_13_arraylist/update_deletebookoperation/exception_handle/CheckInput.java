package java_assignmnet_13_arraylist.update_deletebookoperation.exception_handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInput {
    public int getInput(Scanner scan) {
        int input = 0;
        try {
            input = scan.nextInt();
        } catch (InputMismatchException e) {
            scan.nextLine();
            return -1;
        }
        return Math.max(input, 0);
    }
}
