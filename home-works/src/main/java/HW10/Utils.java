package HW10;

import java.util.*;

public class Utils {

    public static <T> Collection<T> getUnique(Collection<T> input) {
        return new HashSet<>(input);
    }

    public static <T> Map<T, Integer> countElements(T[] array) {
        Map<T, Integer> map = new HashMap<>();
        for (T item : array) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        return map;
    }

    public static <T> boolean areSetsEqual(List<T> list1, List<T> list2) {
        return new HashSet<>(list1).equals(new HashSet<>(list2));
    }

    public static <K, V> Map<V, K> invertMap(Map<K, V> map) {
        Map<V, K> result = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }
}
