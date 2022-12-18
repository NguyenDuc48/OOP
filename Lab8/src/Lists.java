import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(list.size(), value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 666) {
                list.remove(i);
                i--;
            }
        }
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            result.add(i * i);
        }
        return result;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        target.clear();
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        ArrayList<Integer> temp = (ArrayList<Integer>) list.clone();
        list.clear();
        for (int i = temp.size() - 1; i >= 0; i--) {
            list.add(temp.get(i));
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.add(0, value);
        list.add(list.size(), value);
    }

}
