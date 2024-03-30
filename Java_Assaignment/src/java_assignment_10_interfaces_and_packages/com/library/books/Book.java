package java_assignment_10_interfaces_and_packages.com.library.books;

public class Book {

    private int bookId;
    private int bookIsbn;
    private String bookName;
    private String bookAuthor;
    private String bookGenre;
    private String bookPublisher;
    private boolean bookAvailable;
    private static int uniqueId = 0;

    public Book(int bookIsbn, String bookName, String bookAuthor, String bookGenre, String bookPublisher){
        this.bookIsbn = bookIsbn;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookGenre = bookGenre;
        this.bookPublisher = bookPublisher;
    }

    public void setBookId(){
        bookId = ++uniqueId;
    }
    public int getBookId(){
        return bookId;
    }

    public int getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(int bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public boolean getBookAvailable() {
        return bookAvailable;
    }

    public void setBookAvailable(boolean bookAvailable) {
        this.bookAvailable = bookAvailable;
    }

    @Override
    public String toString(){
        return bookId + "  |  " + bookIsbn+ "  |  " +bookName+ "  |  " +bookAuthor+ "  |  " +bookGenre+ "  |  " +bookPublisher+ "  |  " + bookAvailable;
    }
}
