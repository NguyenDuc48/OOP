import java.util.Scanner;

public class FactorialRecusive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println("factorial(" + n + ") = " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }


}
