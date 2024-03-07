package Day_3_March07.CombinedAssaignment_1;
//Create a class Product and add appropriate instance variables
//with different datatypes and try printing them. Note:
//See declaration for System.out.println method for various datatypes

class Product{

    String productName;
    int productStock;
    boolean productIsAvailable;
    float productWeight;
    double productRate;
    char productQuality;
    public Product(String productName,int productStock,boolean productIsAvailable,float productWeight,double productRate,char productQuality){
        this.productName = productName;
        this.productStock = productStock;
        this.productIsAvailable = productIsAvailable;
        this.productWeight = productWeight;
        this.productRate = productRate;
        this.productQuality = productQuality;
    }
}
public class question4 {
    public static void main(String[] args) {
        Product obj = new Product("Lays",20,true,20.50f,30.0,'A');
        System.out.println("Product Name : "+ obj.productName);
        System.out.println("Product Stock : "+obj.productStock);
        System.out.println("Product Availability : "+obj.productIsAvailable);
        System.out.println("Product Weight : "+obj.productWeight);
        System.out.println("Product Rate : "+obj.productRate);
        System.out.println("Product Quality : "+obj.productQuality);
    }
}
