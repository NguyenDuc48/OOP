import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        if (map.containsKey(key)) {
            return map.get(key) == value;
        }
        return false;
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {

        return map.keySet();

    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        Map<Integer, String> mapColor = new HashMap<Integer, String>();
        mapColor.put(0, "black");
        mapColor.put(1, "white");
        mapColor.put(2, "red");
        return mapColor.get(value);
    }

}