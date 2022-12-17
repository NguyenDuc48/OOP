public class ArrayToString {
    public static void main(String[] args) {
        int[] intOneElement = {3};
        int[] intEmptyElement = {};
        int[] intNElement = {3, 4, 5, 6};
        System.out.println(arrayToString(intEmptyElement));

        System.out.println(arrayToString(intOneElement));

        System.out.println(arrayToString(intNElement));
    }

    public static String arrayToString(int[] array) {
        if (array.length == 0) {
            return "Array is empty";
        } else {
            StringBuilder arrStr = new StringBuilder();
            arrStr.append("[");
            for (int i = 0; i < array.length - 1; i++) {
                arrStr.append(array[i] + ", ");
            }
            arrStr.append(array[array.length - 1] + "]");
            return arrStr.toString();
        }

    }
}
