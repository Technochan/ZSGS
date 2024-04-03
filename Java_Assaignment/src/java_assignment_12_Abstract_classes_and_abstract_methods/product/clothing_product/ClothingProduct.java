package java_assignment_12_Abstract_classes_and_abstract_methods.product.clothing_product;

import java_assignment_12_Abstract_classes_and_abstract_methods.product.abstractclass.Product;

public class ClothingProduct extends Product {
    private String size;
    private String material;
    private String style;
    private String gender;

    public ClothingProduct(String name, double price, String description, String size, String material, String style, String gender) {
        super(name, price, description);
        this.size = size;
        this.material = material;
        this.style = style;
        this.gender = gender;
    }

    @Override
    public String getExtraInfo() {
        return "Size : " + size + " | Material : " + material + " | Style : " + style + " | Gender : " + gender;
    }
}
