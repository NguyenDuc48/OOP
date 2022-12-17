import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int n = in.nextInt();
        in.close();
        printPrimeNum(n);
    }

    public static boolean isPrime(int aPosInt) {
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNum(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }
        double percent = Math.round(10000.0 * count / n) / 100.0;
        System.out.println("[" + count + " primes found (" + percent + "%) ]");
    }
}
