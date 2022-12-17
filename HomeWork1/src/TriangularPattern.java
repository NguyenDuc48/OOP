import java.util.Scanner;


public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        printTriangularPatternA(size);
        printTriangularPatternB(size);
        printTriangularPatternC(size);
        printTriangularPatternD(size);
    }

    // in tam giac vuong can co goc vuong phia duoi, ben trai
    public static void printTriangularPatternA(int size) {
        System.out.println("A");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // in tam giac vuong can co goc vuong phia tren, ben trai
    public static void printTriangularPatternB(int size) {
        System.out.println("B");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row + col) <= (size + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // in tam giac vuong can co goc vuong phia tren, ben phai
    public static void printTriangularPatternC(int size) {
        System.out.println("C");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row > col) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    // in tam giac vuong can co goc vuong phia duoi, ben phai
    public static void printTriangularPatternD(int size) {
        System.out.println("D");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}