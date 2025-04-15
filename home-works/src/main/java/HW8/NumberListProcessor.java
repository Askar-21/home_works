package HW8;

import java.util.*;

public class NumberListProcessor {
    public static List<Integer> generateList(int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    public static int sumGreaterThanFive(List<Integer> list) {
        return list.stream().filter(n -> n > 5).mapToInt(Integer::intValue).sum();
    }

    public static void fillListWithNumber(List<Integer> list, int num) {
        Collections.fill(list, num);
    }

    public static void increaseEachElement(List<Integer> list, int num) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + num);
        }
    }
}