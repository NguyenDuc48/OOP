import java.util.Scanner;


public class CheckerPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        // su dung tinh chia du cho 2 de in dung thu tu
        for (int row = 1; row <= size; row++) {
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

}