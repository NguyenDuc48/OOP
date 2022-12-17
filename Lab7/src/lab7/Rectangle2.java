package lab7;

public class Rectangle2 implements GeometricObject {
    private double width;
    private double length;

    public Rectangle2(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle2{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }
}
