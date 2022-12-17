import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int numRows = sc.nextInt();
        int numCol = 2 * numRows - 1;
        printHillPatternA(numRows, numCol);
        printHillPatternB(numRows, numCol);
        printHillPatternC(numRows, numCol);
        printHillPatternD(numRows, numCol);
    }


    public static void printHillPatternA(int numRows, int numCol) {
        System.out.println("A");
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void printHillPatternB(int numRows, int numCol) {
        System.out.println("B");
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((row + col > 2 * numRows) || (row + col < 2 * row)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }


    public static void printHillPatternC(int numRows, int numCol) {
        System.out.println("C");
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = numRows + 1; row <= numCol; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((row + col > (2 * numCol) - (numRows - 1)) || (row + col < 2 * row - (numRows - 1))) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }


    public static void printHillPatternD(int numRows, int numCol) {
        System.out.println("D");
        for (int row = 0; row <= numRows - 1; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for (int row = numRows + 2; row <= numCol + 1; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((row + col > (2 * numCol) - (numRows - 1)) || (row + col < 2 * row - (numRows - 1))) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}