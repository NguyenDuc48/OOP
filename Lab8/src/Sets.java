import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<Integer>();
        Iterator<Integer> iterator = first.iterator();
        while (iterator.hasNext()) {
            Integer temp = iterator.next();
            if (second.contains(temp)) {
                result.add(temp);
            }
        }
        return result;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<Integer>();
        result.addAll(second);
        Iterator<Integer> iterator = first.iterator();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<Integer>();
        result.addAll(first);
        result.retainAll(second);
        return result;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<Integer>();
        result.addAll(first);
        result.addAll(second);
        return result;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> result = new ArrayList<>(source);
        return result;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> temp = new HashSet<>(source);
        List<Integer> result = new ArrayList<>(temp);
        return result;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < source.size(); i++) {
            if (!result.contains(source.get(i))) {
                result.add(source.get(i));
            }
        }
        return result;
    }

    public static String firstRecurringCharacter(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return s.charAt(i) + "";
                }
            }
        }
        return "";
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    result.add(s.charAt(i));
                }
            }
        }
        return result;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] result = new Integer[source.size()];
        int index = 0;
        for (int element : source) {
            result[index] = element;
            index++;
        }
        return result;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }


}