package java_assignment_12_Abstract_classes_and_abstract_methods.book;

// In the book class, add methods to prevent unauthorized modification of book information. Clue: Use login to check authorized personal while updating book details.

import java_assignment_12_Abstract_classes_and_abstract_methods.book.bookmain.Book;

public class BookMain {
    public static void main(String[] args)  {
        new Book().initialControl();
    }
}
