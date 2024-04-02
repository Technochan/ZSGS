package java_assignment_12_Abstract_classes_and_abstract_methods.book.abstractclass;

import java_assignment_12_Abstract_classes_and_abstract_methods.book.database.BookDatabase;
import java_assignment_12_Abstract_classes_and_abstract_methods.book.exceptionclass.UnauthorizedAccessError;
import java_assignment_12_Abstract_classes_and_abstract_methods.book.model.UserDetails;

import java.util.Scanner;

public class BookDetails extends AbstractBook{

    private Scanner scan = new Scanner(System.in);
    public BookDetails(int id, String title, String author, int quantity) {
        super(id, title, author, quantity);
    }
    @Override
    public void updateBookDetail() {
        System.out.println("Enter the Username:");
        String username = scan.next();
        System.out.println("Enter the password");
        String password = scan.next();

        if(BookDatabase.getInstance().checkCredentials(username,password)){
            System.out.println("Access Granted");
        } else {
            try{
                throw new UnauthorizedAccessError();
            } catch (UnauthorizedAccessError e){
                System.out.println(e.getMessage());
            }
        }
    }
}
