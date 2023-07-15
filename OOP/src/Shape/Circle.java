package Shape;

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Override getArea() method for Circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Override getPerimeter() method for Circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
