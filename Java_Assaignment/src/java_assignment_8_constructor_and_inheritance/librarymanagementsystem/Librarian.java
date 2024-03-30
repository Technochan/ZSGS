package java_assignment_8_constructor_and_inheritance.librarymanagementsystem;

import java.util.List;

public class Librarian {

    private String name;
    private int id;
    private String password;
    private String searchString;
    private List<Book> bookList ;

    public Librarian(String name,int id,String password,String searchString){
        this.name = name;
        this.id = id;
        this.password = password;
        this.searchString = searchString;
    }
    public void addBook(Book book){
        bookList.add(book);
    }

    public void verifyLibrarian(){

    }
    public void search(){

    }
}
