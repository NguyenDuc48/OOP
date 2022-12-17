import java.util.Scanner;


public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        printSquarePattern1(size);
        printSquarePattern2(size);
    }


    public static void printSquarePattern1(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }


    public static void printSquarePattern2(int size) {
        int row = 1;
        int col = 0;
        while (row <= size) {
            col = col + 1;
            System.out.print("# ");
            if (col % size == 0) {
                System.out.println();
                row++;
            }
        }
    }
}


