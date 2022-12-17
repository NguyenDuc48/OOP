package lab6;

public class Cylinder2 {
    private Cirlce base;
    private double height;

    public Cylinder2() {
        base = new Cirlce();
        height = 1.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * base.getArea() + base.getCircumference() * this.height;
    }

    public double getVolume() {
        return base.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", color='" + base.color + '\'' +
                ", radius=" + base.radius +
                '}';
    }
}
