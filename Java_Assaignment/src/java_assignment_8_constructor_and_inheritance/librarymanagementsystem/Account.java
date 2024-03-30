package java_assignment_8_constructor_and_inheritance.librarymanagementsystem;

public class Account{

    private int numberOfBorrowedBook;
    private int numberOfReservedBooks;
    private int numberOfReturnedBook;
    private int numberOfLostBooks;
    private double fineAmount;
    private User user;

    public Account(int numberOfBorrowedBook,int numberOfReservedBooks,int numberOfReturnedBook,int numberOfLostBooks,double fineAmount,User user){
        this.numberOfBorrowedBook = numberOfBorrowedBook;
        this.numberOfReservedBooks = numberOfReservedBooks;
        this.numberOfReturnedBook = numberOfReturnedBook;
        this.numberOfLostBooks = numberOfLostBooks;
        this.fineAmount = fineAmount;
        this.user = user;
    }

    public double calculateFine(){
        return fineAmount; // Fine calculation here
    }
}
