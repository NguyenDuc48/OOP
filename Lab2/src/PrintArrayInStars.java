import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int NUM_ITEMS;
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();
        int[] items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < items.length; i++) {
            items[i] = Integer.parseInt(in.next());
        }
        System.out.println();

        for (int idx = 0; idx < items.length; idx++) {
            System.out.print(idx + ": ");
            for (int srarNo = 1; srarNo <= items[idx]; srarNo++) {
                System.out.print("*");
            }
            System.out.print("(" + items[idx] + ")");
            System.out.println();
        }

    }
}
