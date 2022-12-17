package lab6;

public class Circle2 extends Shape {
    private double radius;

    public Circle2() {
        this.radius = 1.0;
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "Circle2{" + super.toString() + " " +
                "radius=" + radius +
                '}';
    }

}
