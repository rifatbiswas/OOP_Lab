package Shape;

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override getArea() method for Rectangle
    @Override
    public double getArea() {
        return length * width;
    }

    // Override getPerimeter() method for Rectangle
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
