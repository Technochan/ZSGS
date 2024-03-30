package java_assignment_8_constructor_and_inheritance.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    private String userType;
    private String username;
    private String password;
    private Librarian librarian;
    private List<User> userList ;
    private List<Book> bookList;


    public LibraryManagementSystem(String userType, String username, String password, Librarian librarian) {
        this.userType = userType;
        this.username = username;
        this.password = password;
        this.librarian = librarian;
    }

    public void addUser(User user){
        userList.add(user);
    }
    public void addBook(Book book){
        bookList.add(book);
    }


    public void login(){
        System.out.println("Login Done...");
    }
    public void register(){
        System.out.println("Registration Success...");
    }
    public void logout(){
        System.out.println("Logout Success...");
    }
}
