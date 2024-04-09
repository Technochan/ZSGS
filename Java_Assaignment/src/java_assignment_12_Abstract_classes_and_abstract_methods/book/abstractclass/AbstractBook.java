package java_assignment_12_Abstract_classes_and_abstract_methods.book.abstractclass;



public abstract class AbstractBook {

    protected int id;
    protected String title;
    protected String author;
    protected int quantity;


    public AbstractBook(int id, String title, String author, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public abstract void updateBookDetail();
}

