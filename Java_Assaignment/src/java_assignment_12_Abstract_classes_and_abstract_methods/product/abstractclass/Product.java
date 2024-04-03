package java_assignment_12_Abstract_classes_and_abstract_methods.product.abstractclass;

public abstract class Product {
    private String name;
    private double price;
    private String description;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public abstract String getExtraInfo();

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void displayDetails() {
        System.out.println("Name : "+name +"\nPrice : "+price+"\nDescription : "+description+"\n"+getExtraInfo());
    }
}
