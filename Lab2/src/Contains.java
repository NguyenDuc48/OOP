public class Contains {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};

        if (contains(array1, 1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
}
