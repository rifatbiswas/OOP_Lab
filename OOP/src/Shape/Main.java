package Shape;

// Main class to test the subclasses
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 3.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        // Call the getArea() and getPerimeter() methods for each shape
        System.out.println("Circle - Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle - Area: " + rectangle.getArea() + ", Perimeter: " + rectangle.getPerimeter());
        System.out.println("Triangle - Area: " + triangle.getArea() + ", Perimeter: " + triangle.getPerimeter());
    }
}

