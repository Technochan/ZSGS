package java_assignment_8_constructor_and_inheritance;

abstract class Shape {
    private double width;
    private double height;
    public Shape(double width, double height) {
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

class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    double calcArea() {
        return getWidth() * getHeight();
    }
}

class Triangle extends Shape {
    public Triangle(double width, double height) {
        super(width, height);
    }

    @Override
    double calcArea() {
        return 0.5 * getWidth() * getHeight();
    }
}

public class MainForShape {
    public static void main(String[] args) {

        Rectangle rectangle =  new Rectangle(4.0, 6.0);
        Triangle triangle =  new Triangle(3.0, 4.0);
        double areaOfRectangle = rectangle.calcArea();
        double areaOfTriangle = triangle.calcArea();
        System.out.println("The Area of Rectangle is "+areaOfRectangle);
        System.out.println("The Area of Triangle is "+areaOfTriangle);
    }
}
