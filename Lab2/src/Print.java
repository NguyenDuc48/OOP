public class Print {
    public static void main(String[] args) {
        int[] intOneElement = {3};
        float[] floatOneElement = {1.4F};
        double[] doubleOneElement = {4.5};

        int[] intEmptyArray = {};
        float[] floatEmptyArray = {};
        double[] doubleEmptyArray = {};

        int[] intNElement = {3, 7, 1};
        float[] floatNElement = {1.4F, 9.3F, 5.3F};
        double[] doubleNElement = {6.3, 2.9, 3.6};

        print(intOneElement);
        print(floatOneElement);
        print(doubleOneElement);

        print(intEmptyArray);
        print(floatEmptyArray);
        print(doubleEmptyArray);

        print(intNElement);
        print(floatNElement);
        print(doubleNElement);


    }

    public static void print(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length - 1] + "]");
        }
        System.out.println();
    }

    public static void print(float[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length - 1] + "]");
        }
        System.out.println();

    }

    public static void print(double[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length - 1] + "]");
        }
        System.out.println();

    }
}
