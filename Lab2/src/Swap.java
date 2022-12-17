public class Swap {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        if (swap(array1, array2)) {
            System.out.println("2 mang sau khi duoc hoan doi la: ");
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + " ");
            }
        } else {
            System.out.println("2 mang khong the hoan doi");
        }
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
            return true;
        }
    }

}
