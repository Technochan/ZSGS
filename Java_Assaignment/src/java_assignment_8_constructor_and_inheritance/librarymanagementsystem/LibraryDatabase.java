package java_assignment_8_constructor_and_inheritance.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {

    private List<Book> bookListDatabase ;
    private List<Account> accountListDatabase ;
    public void addBookInDatabase(Book book){
        bookListDatabase.add(book);
    }
    public void addAccountInDatabase(Account account){
        accountListDatabase.add(account);
    }

    public void addBook(){
        // Adding book into bookListDatabase implementation here
    }
    public void DeleteBook(){
        // Deleting the book from bookListDatabase implementation here
    }
    public void updateBook(){
        // Updating the book into bookListDatabase implementation here
    }
    public void displayBook(){
        // Displaying the book implementation here or else we can return the list and change the return void to List<Book>
    }
    public void searchBook(String bookName){
        // Search the matched book and we may display here or else return that (to return change the return type)
    }
}
