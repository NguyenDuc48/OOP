import java.util.Scanner;

public class LengthOfSequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println("The length of S(" + n + ") is " + getLength(n));
    }

    public static int getLength(int n) {
        if (n == 1) {
            return 1;
        }
        return getLength(n - 1) + numOfDigits(n);
    }

    public static int numOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
