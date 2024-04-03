package java_assignment_12_Abstract_classes_and_abstract_methods.product.database;

import java_assignment_12_Abstract_classes_and_abstract_methods.product.abstractclass.Product;

import java.util.ArrayList;
import java.util.List;

public class Productdatabase {
    private List<Product> products;

    public Productdatabase() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calcPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void displayAllProducts() {
        for (Product product : products) {
            product.displayDetails();
            System.out.println();
        }
    }
}
