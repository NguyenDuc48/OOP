public class Search {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(search(array, 0));
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }


}
