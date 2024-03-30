package java_assignment_10_interfaces_and_packages.com.library.transaction;

import java_assignment_10_interfaces_and_packages.com.library.books.Book;
import java_assignment_10_interfaces_and_packages.com.library.members.Member;

import java.time.LocalDate;
import java.util.Date;


public class Transaction {

    private int transactionId;
    private Book book;
    private Member member;
    private String transactionType;
    private LocalDate transactionDate;
    private LocalDate returnDate;
    private double fees;
    private static int uniqueId = 0;


    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Transaction( Book book, Member member, String transactionType, LocalDate transactionDate, LocalDate returnDate,double fees) {
        this.book = book;
        this.member = member;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.returnDate = returnDate;
        this.fees = fees;
    }


    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId() {
        transactionId = ++uniqueId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }



    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString(){
        return transactionId+ "  |  " + book.getBookName()+ "  |  " +member.getMemberName()+transactionType+ "  |  " +transactionDate+ "  |  " +returnDate+ "  |  " +fees;
    }
}
