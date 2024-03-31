package java_assignment_10_interfaces_and_packages.com.library.control;

import java_assignment_10_interfaces_and_packages.com.library.books.Book;
import java_assignment_10_interfaces_and_packages.com.library.database.LibraryDatabase;
import java_assignment_10_interfaces_and_packages.com.library.members.Member;
import java_assignment_10_interfaces_and_packages.com.library.transaction.Transaction;
import sun.util.resources.LocaleData;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryControlModel {

    private LibraryControlView libraryControlView;
    private List<Book> bookList = LibraryDatabase.getInstance().getBooks();
    private List<Member> memberList = LibraryDatabase.getInstance().getMembers();
    private List<Transaction> transactionList = LibraryDatabase.getInstance().getTransactions();
    private LibraryDatabase libraryDatabase ;
    private Book borrowBook = null;
    private Member borrowMember = null;

    public LibraryControlModel(LibraryControlView libraryControlView){
        this.libraryControlView = libraryControlView;
        libraryDatabase =  new LibraryDatabase();
    }

    public void addBook(Book book) {
        LibraryDatabase.getInstance().addBookToDatabase(book);
        libraryControlView.showText("Book Id : "+book.getBookId() + "\nBook Added Successfully");
    }

    public void addMember(Member member) {
        LibraryDatabase.getInstance().addMemberToDatabase(member);
        libraryControlView.showText("Member Id : "+member.getMemberId() + "\nMember Added Successfully");
    }

    public void borrowBook(int bookId, int memberId, char type) {
        for(Book book : bookList){
            if(book.getBookId() == bookId){
                borrowBook = book;
                break;
            }
        }
        for(Member member : memberList){
            if(member.getMemberId() == memberId){
                borrowMember = member;
                break;
            }
        }
        if(type == 'B' && borrowBook.getBookAvailable()) {
            borrowBook.setBookAvailable(false);
            LocalDate currDate = LocalDate.now();
            Transaction transaction = new Transaction(borrowBook, borrowMember, "Borrow", currDate, currDate.plusDays(5), 10);
            transaction.setTransactionId();
            LibraryDatabase.getInstance().addTransactionToDatabase(transaction);
            libraryControlView.showText("Book :" + borrowBook.getBookName() + " Borrowed By " + borrowMember.getMemberName());
        } else if(type == 'R' && !borrowBook.getBookAvailable()) {
            borrowBook.setBookAvailable(true);
        } else {
            libraryControlView.showText("The book Is Not available");
        }
    }

    public void searchBook(String bookWords) {
        List<Book> matchingBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getBookName().toLowerCase().contains(bookWords.toLowerCase())) {
                matchingBooks.add(book);
            }
        }
        if(!matchingBooks.isEmpty()) {
            libraryControlView.printBookDetails(matchingBooks);
        } else {
            libraryControlView.showText("No Book are available OR No Matches are found ");
        }
    }


    public void generateBookReport() {
        if(!bookList.isEmpty()) {
            libraryControlView.printBookDetails(bookList);
        } else {
            libraryControlView.showText("Book List Is Empty");
        }
    }

    public void generateMemberReport() {
        if(!memberList.isEmpty()) {
            libraryControlView.printMemberDetails(memberList);
        } else {
            libraryControlView.showText("Library List Is Empty");
        }
    }
    public void generateTransactionReport() {
        if(!transactionList.isEmpty()) {
            libraryControlView.printTransactionDetails(transactionList);
        } else {
            libraryControlView.showText("Transaction List is Empty");
        }
    }

}
