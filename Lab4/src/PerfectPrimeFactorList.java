import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int n = in.nextInt();
        in.close();
        printPerfectPrimeNum(n);
    }

    public static boolean isValid(int aPosNum) {
        int product = 1;
        int num = aPosNum;
        for (int i = 2; i < num; i++) {
            boolean check = true;
            while (aPosNum % i == 0) {
                if (check) {
                    product *= i;
                }
                check = false;
                aPosNum /= i;
            }
        }
        return product == num;
    }

    public static void printPerfectPrimeNum(int n) {
        int count = 0;
        System.out.println("These numbers are equal to the product of prime factors:");
        for (int i = 1; i <= n; i++) {
            if (isValid(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        double percent = Math.round(10000.0 * count / n) / 100.0;
        System.out.println("[" + count + " numbers found (" + percent + "%) ]");
    }
}
