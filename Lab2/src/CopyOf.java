public class CopyOf {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};

        int[] newArr = copyOf(array);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] copyOf(int[] array) {
        int[] arrCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrCopy[i] = array[i];
        }
        return arrCopy;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] arrCopy = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            arrCopy[i] = array[i];
        }
        return arrCopy;
    }

}
