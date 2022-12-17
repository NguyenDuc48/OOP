package lab5;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        color = "red";
        radius = 1.0;
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumfernce() {
        return Math.PI * this.radius * 2;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius = " + radius + ']';
    }
}
