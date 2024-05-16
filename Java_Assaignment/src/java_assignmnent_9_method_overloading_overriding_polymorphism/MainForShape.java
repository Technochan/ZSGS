package java_assignmnent_9_method_overloading_overriding_polymorphism;

// Use the hierarchy of shape classes done already in previous assignments. Demonstrate polymorphism by calculating area and perimeter of various shapes.


abstract class ShapePolymorphismDemo {
    private double width;
    private double height;
    public ShapePolymorphismDemo(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    abstract double calcArea();
}

class Rectangle extends ShapePolymorphismDemo {
    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    double calcArea() {
        return getWidth() * getHeight();
    }
}

class Triangle extends ShapePolymorphismDemo {
    public Triangle(double width, double height) {
        super(width, height);
    }

    @Override
    double calcArea() {
        return 0.5 * getWidth() * getHeight();
    }
}
class Circle extends ShapePolymorphismDemo {
    private double radius;
    public Circle(double radius) {
        super(0,0); // unnecessary call. Nothing will happen but i have to match the parent abstract class 2 arguments constructor else it gets error
        this.radius = radius;
    }
    @Override
    double calcArea() {
        return Math.PI * radius * radius;
    }
}


public class MainForShape {
    public static void main(String[] args) {
        ShapePolymorphismDemo shapePolymorphismDemo1 = new Rectangle(20.0,10.0);
        ShapePolymorphismDemo shapePolymorphismDemo2 = new Triangle(10.0,20.0);
        ShapePolymorphismDemo shapePolymorphismDemo3 = new Circle(10);


        double areaOfRectangle = shapePolymorphismDemo1.calcArea();
        double areaOfTriangle = shapePolymorphismDemo2.calcArea();
        double areaOfCircle = shapePolymorphismDemo3.calcArea();
        System.out.println("The Area of Rectangle is "+areaOfRectangle);
        System.out.println("The Area of Triangle is "+areaOfTriangle);
        System.out.println("The Area of Circle is "+areaOfCircle);
    }
}
