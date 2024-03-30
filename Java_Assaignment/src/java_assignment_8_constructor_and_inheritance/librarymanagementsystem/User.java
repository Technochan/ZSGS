package java_assignment_8_constructor_and_inheritance.librarymanagementsystem;

import java.util.List;

public class User {

    private String username;
    private int userId;
    private List<Book> userBook ;

    public User(String username,int userId){
        this.username = username;
        this.userId = userId;
    }

    public void addBook(Book book){
        userBook.add(book);
    }
    public void verify(){
        System.out.println("Verification Done...");
    }
    public void checkAccount(){
        System.out.println("Checking account...");
    }
    public void getBookInfo(){
        System.out.println("Getting book info");
    }
}
