package java_assignment_12_Abstract_classes_and_abstract_methods.product;

import java_assignment_12_Abstract_classes_and_abstract_methods.product.bookproduct.BookProduct;
import java_assignment_12_Abstract_classes_and_abstract_methods.product.clothing_product.ClothingProduct;
import java_assignment_12_Abstract_classes_and_abstract_methods.product.database.Productdatabase;
import java_assignment_12_Abstract_classes_and_abstract_methods.product.electronics_product.ElectronicsProduct;

public class ProductMain {
    public static void main(String[] args) {
        ElectronicsProduct electronicsProduct = new ElectronicsProduct("Laptop", 50, "Very Good-performance laptop", "Dell", 2, "XPS 15", "Blue");
        ClothingProduct clothingProduct = new ClothingProduct("Shirt", 200, "Cotton shirt", "Small", "Cotton", "Casual", "Male");
        BookProduct bookProduct = new BookProduct("Java Programming", 0, "Programming guide Book", "Thamarai san", 500, "Tamizh", "1st");

        Productdatabase product = new Productdatabase();
        product.addProduct(electronicsProduct);
        product.addProduct(clothingProduct);
        product.addProduct(bookProduct);
        product.displayAllProducts();
        double totalPrice = product.calcPrice();
        System.out.println("Total All Product Price : " + totalPrice);
    }
}
