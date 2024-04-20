package java_assignmnet_13_arraylist.update_deletebookoperation.Book_View_Model;

import java_assignmnet_13_arraylist.update_deletebookoperation.exception_handle.CheckInput;
import java_assignmnet_13_arraylist.update_deletebookoperation.model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookModel {

    private BookView view;
    private ArrayList<Book> bookList;
    private  CheckInput checkInput ;
    private Scanner scan ;
    public BookModel(BookView view) {
        this.view = view;
        this.bookList = new ArrayList<>();
        checkInput = new CheckInput();
        scan = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            view.displayMenu();
            int input = checkInput.getInput(scan);
            switch (input) {
                case 1:
                    addBook();
                    break;
                case 2:
                    showBooks();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    view.displayMessage("Exiting....");
                    return;
                default:
                    view.displayMessage("Invalid Input");
            }
        }
    }

    public void addBook() {
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
        if(year <= 0){
            view.displayMessage("Invalid Year Input");
            return;
        }
        view.displayMessage("Enter the Book Stock");
        int stock = checkInput.getInput(scan);
        if(stock <= 0){
            view.displayMessage("Invalid Stock Input");
            return;
        }
        Book newBook = new Book(name, author, genre, publisherName, year, stock);
        bookList.add(newBook);
        view.displayMessage("Book Added Successfully");
    }

    public void updateBook(){
        view.displayUpdateOptions();
        int choice = checkInput.getInput(scan);
        int id = 0;
        switch (choice){
            case 1 :
                id = chooseBookId();
                view.displayMessage("Enter The New Name");
                String name = scan.next();
                updateBookName(id,name);
                break;
            case 2 :
                id = chooseBookId();
                view.displayMessage("Enter The New Stock");
                int newStock = checkInput.getInput(scan);
                updateBookStock(id,newStock);
                break;
            default:
                view.displayMessage("Invalid Input");
        }
    }

    public void updateBookStock(int id, int newStock) {
        for (Book book : bookList) {
            if(book.getId() == id){
                book.setStock(book.getStock() + newStock);
                view.displayMessage("Book Stock Updated Successfully");
                return;
            }
        }
        view.displayMessage("Book Id Not Found");
    }

    public int chooseBookId(){
        view.displayMessage("Choose the Book Id");
        showBooks();
        int id = checkInput.getInput(scan);
        return id == 0 ? 0 : id;
    }

    public void updateBookName(int id, String name) {
        for (Book book : bookList) {
            if(book.getId() == id){
                book.setName(name);
                view.displayMessage("Book Name Updated Successfully");
                return;
            }
        }
        view.displayMessage("Book Id Not Found");
    }

    public void deleteBook(){
        int id = chooseBookId();
        for (Book book : bookList) {
            if(book.getId() == id){
                bookList.remove(book);
                view.displayMessage("Book Removed Successfully");
                return;
            }
        }
        view.displayMessage("Book Id Not Found");
    }

    public void showBooks() {
        if(!bookList.isEmpty()) {
            for (Book book : bookList) {
                view.displayBook(book);
            }
        } else {
            view.displayMessage("Book List is Empty");
        }
    }
}
