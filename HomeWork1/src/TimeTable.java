import java.util.Scanner;


public class TimeTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        // su dung ham printf va dinh dang tuong ung

        for (int row = -1; row <= size; row++) {
            if (row == -1) {
                System.out.printf("%2c%c|", '*', ' ');
            } else if (row == 0) {
                System.out.print("-----");
            } else if (row > 0) {
                System.out.printf("%2d%c|", row, ' ');
            }
            for (int col = 1; col <= size; col++) {
                if (row == -1) {
                    System.out.printf("%4d", col);
                } else if (row == 0) {
                    System.out.print("----");
                } else if (row > 0) {
                    System.out.printf("%4d", col * row);
                }
            }
            System.out.println();
        }

    }

}