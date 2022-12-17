package lab6;

public class Cirlce {
    protected String color;
    protected double radius;

    public Cirlce(String color) {
        this.color = color;
    }

    public Cirlce() {
        this.color = "white";
        this.radius = 1.0;
    }

    public Cirlce(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public Cirlce(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Cirlce{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
