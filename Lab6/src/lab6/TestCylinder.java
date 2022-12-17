package lab6;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println(cy1);

        System.out.println(cy1.getVolume());
        Cirlce cr1 = new Cirlce();
        System.out.println(cr1.getArea());
        System.out.println(cr1);
        Cirlce cr2 = new Cylinder();
        System.out.println(cr2);
        System.out.println(cr2.getArea());
        if (cr2 instanceof Cylinder) {
            System.out.println(((Cylinder) cr2).getArea());
        }

    }
}
