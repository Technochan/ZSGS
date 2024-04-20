package java_assignmnet_13_arraylist.update_deletebookoperation.model;

public class Book {



    int id;
    String name;
    String author;
    String genre;
    String publisherName;
    int publishYear;
    int stock;
    static int uniqueId = 0;

    public Book(String name, String author, String genre, String publisherName, int publishYear,int stock) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.publisherName = publisherName;
        this.publishYear = publishYear;
        this.stock = stock;
        id = ++uniqueId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    public void setStock(int stock){
        this.stock = stock;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public int getPublishYear() {
        return publishYear;
    }
    public int getStock(){
        return stock;
    }
    @Override
    public String toString() {
        return "ID : " + id + " | Name : " + name + " | Author : " + author + " | Genre : " + genre
                + " | Publisher Name : " + publisherName + " | Publish Year : " + publishYear+" | Stock : "+stock;
    }
}
