package java_assignment_12_Abstract_classes_and_abstract_methods.book.bookmain;

import java_assignment_12_Abstract_classes_and_abstract_methods.book.abstractclass.BookDetails;
import java_assignment_12_Abstract_classes_and_abstract_methods.book.database.BookDatabase;
import java_assignment_12_Abstract_classes_and_abstract_methods.book.model.UserDetails;

public class Book {

    public void initialControl() {
        BookDetails bookOne = new BookDetails(1,"Ponniyin Selvan - part 1","Kalki",20);
        BookDatabase.getInstance().insertBookList(bookOne);

        UserDetails admin = new UserDetails(1,"Admin","Admin123");
        UserDetails userOne = new UserDetails(2,"UserOne","UserOne123");
        UserDetails userTwo = new UserDetails(2,"UserTwo","UserTwo123");
        BookDatabase.getInstance().insertAdminCredentials(admin.getUsername(), admin.getUserPassword());
        BookDatabase.getInstance().insertUserList(userOne);
        BookDatabase.getInstance().insertUserList(userTwo);
        bookOne.updateBookDetail();
    }
}
