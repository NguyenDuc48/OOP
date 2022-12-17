package lab7;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(double size, String color, boolean filled) {
        super(color, filled, size, size);
    }

    public double getSize() {
        return this.length;
    }

    public void setSize(double size) {
        this.setLength(size);
        this.setWidth(size);
    }

    public void setWidth(double size) {
        this.setWidth(size);
    }

    public void setLength(double size) {
        this.setLength(size);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
