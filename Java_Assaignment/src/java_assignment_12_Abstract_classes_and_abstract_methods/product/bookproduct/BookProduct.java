package java_assignment_12_Abstract_classes_and_abstract_methods.product.bookproduct;

import java_assignment_12_Abstract_classes_and_abstract_methods.product.abstractclass.Product;

public class BookProduct extends Product {
    private String author;
    private int pages;
    private String language;
    private String edition;

    public BookProduct(String name, double price, String description, String author, int pages, String language, String edition) {
        super(name, price, description);
        this.author = author;
        this.pages = pages;
        this.language = language;
        this.edition = edition;
    }

    @Override
    public String getExtraInfo() {
        return "Author : " + author + " | Pages : " + pages + " | Language : " + language + " | Edition : " + edition;
    }
}
