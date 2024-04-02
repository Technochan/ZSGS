package java_assignment_12_Abstract_classes_and_abstract_methods.book.database;

import java_assignment_12_Abstract_classes_and_abstract_methods.book.abstractclass.BookDetails;
import java_assignment_12_Abstract_classes_and_abstract_methods.book.model.UserDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookDatabase {
    private static BookDatabase bookDatabase;

    public static BookDatabase getInstance(){
        if(bookDatabase == null){
            bookDatabase = new BookDatabase();
        }
        return bookDatabase;
    }
    private List<BookDetails> bookList = new ArrayList<>();
    private List<UserDetails> userList = new ArrayList<>();
    private HashMap<String,String> admins = new HashMap<>();
    public void insertBookList(BookDetails book){
        bookList.add(book);
    }
    public void insertUserList(UserDetails user){
        userList.add(user);
    }
    public void insertAdminCredentials(String name,String password){
        admins.put(name,password);
    }

    public boolean checkCredentials(String name,String password){
        return (admins.containsKey(name) && admins.get(name).equals(password));
    }

}
