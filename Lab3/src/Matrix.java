import java.util.Scanner;

public class Matrix {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {-6, 3}};
        int[][] matrix2 = {{-18, -3}, {-20, 3}};
        print(multiply(matrix1, matrix2));
    }

    public static int[][] createRandomMatrixInt(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = in.nextInt();
            }
        }
        return matrix;
    }

    public static double[][] createRandomMatrixDouble(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = in.nextDouble();
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.println(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            int rows = matrix1.length;
            int cols = matrix1[0].length;
            int[][] sumMatrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return sumMatrix;
        } else {
            return null;
        }
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            int rows = matrix1.length;
            int cols = matrix1[0].length;
            double[][] sumMatrix = new double[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return sumMatrix;
        } else {
            return null;
        }
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            int rows = matrix1.length;
            int cols = matrix1[0].length;
            double[][] sumMatrix = new double[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sumMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return sumMatrix;
        } else {
            return null;
        }
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            int rows = matrix1.length;
            int cols = matrix1[0].length;
            int[][] sumMatrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sumMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return sumMatrix;
        } else {
            return null;
        }
    }

    public static boolean isValidToMultiply(int[][] matrix1, int[][] matrix2) {
        return matrix1[0].length == matrix2.length;
    }

    public static boolean isValidToMultiply(double[][] matrix1, double[][] matrix2) {
        return matrix1[0].length == matrix2.length;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (isValidToMultiply(matrix1, matrix2)) {
            int rows = matrix1.length;
            int cols = matrix2[0].length;
            int[][] multiplyMatrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                int idxCol = 0;
                while (idxCol < cols) {
                    int sum = 0;
                    for (int j = 0; j < matrix2.length; j++) {
                        sum = sum + matrix1[i][j] * matrix2[j][idxCol];
                    }
                    multiplyMatrix[i][idxCol] = sum;
                    idxCol++;
                }
            }
            return multiplyMatrix;
        } else {
            return null;
        }
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (isValidToMultiply(matrix1, matrix2)) {
            int rows = matrix1.length;
            int cols = matrix2[0].length;
            double[][] multiplyMatrix = new double[rows][cols];
            for (int i = 0; i < rows; i++) {
                int idxCol = 0;
                while (idxCol < cols) {
                    double sum = 0;
                    for (int j = 0; j < matrix2.length; j++) {
                        sum = sum + matrix1[i][j] * matrix2[j][idxCol];
                    }
                    multiplyMatrix[i][idxCol] = sum;
                    idxCol++;
                }
            }
            return multiplyMatrix;
        } else {
            return null;
        }
    }
}
