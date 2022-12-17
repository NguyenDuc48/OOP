import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        double radius, diameter, cirumference, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();
        System.out.printf("Diameter is: %.2f%n", 2 * radius);
        System.out.printf("Area is: %.2f%n", Math.PI * radius * radius);
        System.out.printf("Circumference is: %.2f%n", 2.0 * radius * Math.PI);
    }
}
