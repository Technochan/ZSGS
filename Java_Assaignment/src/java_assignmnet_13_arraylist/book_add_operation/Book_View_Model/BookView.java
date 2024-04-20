package java_assignmnet_13_arraylist.book_add_operation.Book_View_Model;

import java_assignmnet_13_arraylist.book_add_operation.model.Book;

public class BookView {

    BookModel bookController;

    public BookView() {
        bookController = new BookModel(this);
    }

    public void start() {
        bookController.start();
    }

    public void displayMenu() {
        System.out.println("Choose The Option\n-------------------\n1.Add Book \n2.Show Book \n3.Exit");
    }

    public void displayMessage(String showText) {
        System.out.println("\n"+showText);
    }

    public void displayBook(Book book) {
        System.out.println(book);
    }

}

