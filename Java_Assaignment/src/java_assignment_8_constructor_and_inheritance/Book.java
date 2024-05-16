package java_assignment_8_constructor_and_inheritance;

// Add a constructor to the Book class alreday created. Write a function to add books using constructors to an array of <Book> objects, and display all the books added.
import java.util.ArrayList;

public class Book {
    // Instance variables Declaration
    private int bookId;
    private String title;
    private String isbn;
    private String author;
    private String genre;
    private int yearPublishedYear;
    private String publisher;
    private double price;
    private static ArrayList<Book> books = new ArrayList<Book>();
    private static int uniqueBookId;

    static {
        uniqueBookId = 0;
    }

    public Book(String title, String isbn, String author, String genre, int yearPublishedYear, String publisher, double price) {
        this.bookId = ++uniqueBookId;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.genre = genre;
        this.yearPublishedYear = yearPublishedYear;
        this.publisher = publisher;
        this.price = price;
        books.add(this);
    }

    public static ArrayList<Book> getBookList() {
        return books;
    }

    @Override
    public String toString() {
        return String.format("%-5s | %-30s | %-13s | %-25s | %-15s | %-4d | %-25s | %.2f ", bookId, title, isbn, author, genre, yearPublishedYear, publisher, price);
    }

}
    class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Java: The Complete Reference","9780071808552","Herbert Schildt","Programming",2014,"McGraw-Hill Education",50.31);
        Book bookTwo = new Book("Effective Java","9780134685991","Joshua Bloch","Programming",2018,"Addison-Wesley Professional",40.00);
        Book bookThree = new Book("Head First Java","9780596009205","JKathy Sierra and Bert Bates","Programming",2005,"O'Reilly Media",30.12);

        ArrayList<Book> bookList = Book.getBookList();
        for(Book bookDetails : bookList){
            System.out.println(bookDetails);
        }
    }
}