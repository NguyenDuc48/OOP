package lab7;

public class ResizableCircle extends Circle2 implements Resizable {


    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        super.setRadius(super.getRadius() * (percent / 100.0));
    }

    @Override
    public String toString() {
        return "ResizableCircle" + super.toString();
    }
}
