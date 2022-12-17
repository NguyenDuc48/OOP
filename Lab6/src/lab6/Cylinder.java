package lab6;

public class Cylinder extends Cirlce {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * super.getArea() + super.getCircumference() * this.height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
