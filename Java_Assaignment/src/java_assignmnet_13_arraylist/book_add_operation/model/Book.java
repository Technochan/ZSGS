package java_assignmnet_13_arraylist.book_add_operation.model;

public class Book {

    int id;
    String name;
    String author;
    String genre;
    String publisherName;
    int publishYear;
    static int uniqueId = 0;

    public Book(String name, String author, String genre, String publisherName, int publishYear) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.publisherName = publisherName;
        this.publishYear = publishYear;
        id = ++uniqueId;
    }

    @Override
    public String toString() {
        return "ID : " + id + " | Name : " + name + " | Author : " + author + " | Genre : " + genre
                + " | Publisher Name : " + publisherName + " | Publish Year : " + publishYear;
    }
}
