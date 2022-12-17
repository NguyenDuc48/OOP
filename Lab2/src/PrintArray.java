import java.util.Scanner;

public class PrintArray {
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
        System.out.print("The values are: [");
        for (int i = 0; i < items.length - 1; i++) {
            System.out.print(items[i] + ", ");
        }
        System.out.print(items[items.length - 1] + "]");

    }
}
