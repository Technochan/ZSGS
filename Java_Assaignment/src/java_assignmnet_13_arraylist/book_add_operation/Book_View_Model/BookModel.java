package java_assignmnet_13_arraylist.book_add_operation.Book_View_Model;

import java_assignmnet_13_arraylist.book_add_operation.exception_handle.CheckInput;
import java_assignmnet_13_arraylist.book_add_operation.model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookModel {

    private BookView view;
    private ArrayList<Book> bookList;

    public BookModel(BookView view) {
        this.view = view;
        this.bookList = new ArrayList<>();
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        CheckInput checkInput = new CheckInput();

        while (true) {
            view.displayMenu();
            int input = checkInput.getInput(scan);
            switch (input) {
                case 1:
                    addBook(scan, checkInput);
                    break;
                case 2:
                    showBooks();
                    break;
                case 3:
                    view.displayMessage("Exiting....");
                    return;
                default:
                    view.displayMessage("Invalid Input");
            }
        }
    }

    public void showBooks() {
        if(!bookList.isEmpty()) {
            for (Book book : bookList) {
                view.displayBook(book);
            }
        } else {
            view.displayMessage("Book List is empty");
        }
    }

    private void addBook(Scanner scan, CheckInput checkInput) {
        view.displayMessage("Enter book name");
        String name = scan.next();
        view.displayMessage("Enter book author");
        String author = scan.next();
        view.displayMessage("Enter book genre");
        String genre = scan.next();
        view.displayMessage("Enter book publisher name");
        String publisherName = scan.next();
        view.displayMessage("Enter book publish year");
        int year = checkInput.getInput(scan);
        if(year == 0){
            view.displayMessage("Invalid Year Input");
            return;
        }
        Book newBook = new Book(name, author, genre, publisherName, year);
        bookList.add(newBook);
        view.displayMessage("Book Added Successfully");
    }
}
