package java_assignmnet_13_arraylist.update_deletebookoperation.Book_View_Model;

import java_assignmnet_13_arraylist.update_deletebookoperation.model.Book;

public class BookView {

    BookModel bookController;

    public BookView() {
        bookController = new BookModel(this);
    }

    public void start() {
        bookController.start();
    }

    public void displayMenu() {
        System.out.println("Choose The Option\n-------------------\n1.Add Book \n2.Show Book \n3.Update Book \n4.Delete Book \n5.Exit");
    }
    public void displayUpdateOptions(){
        System.out.println("\n1.Update Book Name \n2.Update Book Stack");
    }
    public void displayMessage(String showText) {
        System.out.println("\n"+showText);
    }

    public void displayBook(Book book) {
        System.out.println(book);
    }

}

