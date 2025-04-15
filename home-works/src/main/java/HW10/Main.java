package HW10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Итератор
        Integer[] nums = {1, 2, 3};
        ArrayIterator<Integer> iter = new ArrayIterator<>(nums);
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // 2. Уникальные значения
        List<String> list = Arrays.asList("a", "b", "a", "c");
        System.out.println("Уникальные: " + Utils.getUnique(list));

        // 3. Подсчёт элементов
        String[] arr = {"a", "b", "a", "c", "b"};
        System.out.println("Счёт: " + Utils.countElements(arr));

        // 4. Сравнение множеств
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(3, 2, 1, 1);
        System.out.println("Множества равны? " + Utils.areSetsEqual(l1, l2));

        // 5. Инверсия Map
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        System.out.println("Инверсия: " + Utils.invertMap(map));

        // 6. Стек
        IntStack stack = new IntStack(2);
        stack.push(10);
        stack.push(20);
        System.out.println("Верх стека: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Пустой? " + stack.isEmpty());
    }
}
