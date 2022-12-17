package lab6;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Rectangle rec1 = new Rectangle(1, 3, "Blue", true);
        System.out.println(rec1);
        System.out.println(rec1.getArea());
        Square square1 = new Square(4, "White", true);
        System.out.println(square1);
    }
}
