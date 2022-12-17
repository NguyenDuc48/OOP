import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int n = in.nextInt();
        in.close();
        printPerfectNum(n);
        printNotPerfectAndDeficientNum(n);
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum == aPosInt) {
            return true;
        }
        return false;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum < aPosInt) {
            return true;
        }
        return false;
    }

    public static void printPerfectNum(int n) {
        if (n < 6) {
            System.out.println("0 perfect numbers found (0.00 %");
        } else {
            int count = 0;
            System.out.println("There numbers are perfect: ");
            for (int i = 6; i <= n; i++) {
                if (isPerfect(i)) {
                    count++;
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            double percent = Math.round((10000.0 * count) / n) / 100.0;
            System.out.println("[" + count + " perfect numbers found (" + percent + "%)]");
        }
    }

    public static void printNotPerfectAndDeficientNum(int n) {
        int count = 0;
        System.out.println("These numbers are neither deficient nor perfect:");
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i) == false && isDeficient(i) == false) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        double percent = Math.round((10000.0 * count) / n) / 100.0;
        System.out.println("[" + count + " numbers found (" + percent + "%) ]");
    }
}
