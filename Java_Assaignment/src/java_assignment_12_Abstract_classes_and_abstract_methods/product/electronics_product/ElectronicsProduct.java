package java_assignment_12_Abstract_classes_and_abstract_methods.product.electronics_product;

import java_assignment_12_Abstract_classes_and_abstract_methods.product.abstractclass.Product;

public class ElectronicsProduct extends Product {
    private String brand;
    private int warrenty;
    private String model;
    private String color;

    public ElectronicsProduct(String name, double price, String description, String brand, int warrenty, String model, String color) {
        super(name, price, description);
        this.brand = brand;
        this.warrenty = warrenty;
        this.model = model;
        this.color = color;

    }

    @Override
    public String getExtraInfo() {
        return "Brand : " + brand + " | Warranty Period: " + warrenty + " months  |  Model: " + model + "  |  Color: " + color;
    }
}
