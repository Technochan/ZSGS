package java_assignment_7_class_and_object_and_encapsulation;

public class BookDTO {
    // Instance variables Declaration
    private int bookId;
    private String title;
    private String isbn;
    private String author;
    private String genre;
    private int yearPublishedYear;
    private String publisher;
    private double price;
    static int uniqueBookId;

    static {
        uniqueBookId = 0;
    }

    //Can we use constructor or else we use the setter method
    public BookDTO(String title, String isbn, String author, String genre, int yearPublishedYear, String publisher, double price) {
        this.bookId = ++uniqueBookId;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.genre = genre;
        this.yearPublishedYear = yearPublishedYear;
        this.publisher = publisher;
        this.price = price;
    }

    public void setBookId() {
        bookId = ++uniqueBookId;
    }

    public int getBookID() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublishedYear() {
        return yearPublishedYear;
    }

    public void setYearPublishedYear(int yearPublishedYear) {
        this.yearPublishedYear = yearPublishedYear;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
