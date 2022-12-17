import java.util.Scanner;

public class GCDRecursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        System.out.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (a == b) {
            return a;
        }
        return gcd(b, remainder(a, b));
    }

    public static int remainder(int a, int b) {
        return a > b ? a - b : b - a;
    }
}
