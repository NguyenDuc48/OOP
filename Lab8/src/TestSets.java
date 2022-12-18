import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestSets {
    public static void main(String[] args) {
        HashSet<Integer> first = new HashSet<Integer>();
        HashSet<Integer> second = new HashSet<Integer>();
        first.add(1);
        first.add(3);
        first.add(2);
        first.add(9);
        second.add(1);
        second.add(0);
        second.add(3);
        System.out.println(Sets.intersectionManual(first, second));
        System.out.println(Sets.intersection(first, second));
        System.out.println(Sets.unionManual(first, second));
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        System.out.println(Sets.removeDuplicates(list));


    }
}
