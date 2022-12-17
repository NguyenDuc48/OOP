package lab5;

public class TestMyPolynomical {
    public static void main(String[] args) {
        double[] arr1 = {1, 3, 4.5};
        double[] arr2 = {-3, 7.6, 1};
        MyPolynomical poly1 = new MyPolynomical(arr1);
        MyPolynomical poly2 = new MyPolynomical(arr2);
        System.out.println(poly1);
        System.out.println(poly2);
        MyPolynomical addPoly = poly1.add(poly2);
        System.out.println(addPoly);
    }
}
