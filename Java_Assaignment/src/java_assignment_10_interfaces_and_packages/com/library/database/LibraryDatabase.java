package java_assignment_10_interfaces_and_packages.com.library.database;

import java_assignment_10_interfaces_and_packages.com.library.books.Book;
import java_assignment_10_interfaces_and_packages.com.library.members.Member;
import java_assignment_10_interfaces_and_packages.com.library.transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {

    private static LibraryDatabase libraryDatabase;

    public static LibraryDatabase getInstance(){
        if(libraryDatabase == null){
            libraryDatabase = new LibraryDatabase();
        }
        return libraryDatabase;
    }

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    public List<Book> getBooks(){
        return books;
    }
    public List<Member> getMembers(){
        return members;
    }
    public List<Transaction> getTransactions(){
        return transactions;
    }

    // add Book Details
    public void addBookToDatabase(Book book) {
        books.add(book);
    }

    // add Member Details
    public void addMemberToDatabase(Member member) {
        members.add(member);
    }
    // add Transaction Details
    public void addTransactionToDatabase(Transaction transaction){
        transactions.add(transaction);
    }
}
