import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SENTINEL = -1;
        int sum = 0;
        int num;
        do {
            System.out.print("Enter a positive integer (or -1 to end): ");
            num = in.nextInt();
            if (hasEight(num)) {
                sum += num;
            }
        } while (num != SENTINEL);
        System.out.println("The magic sum is: " + sum);
    }

    public static boolean hasEight(int number) {
        String numStr = Integer.toString(number);
        if (numStr.indexOf('8') == -1) {
            return false;
        } else {
            return true;
        }
    }

}
