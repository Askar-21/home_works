package kz.kaznu.askar.HW2;
import java.util.Arrays;

public class MainApplication {

    public static void main(String[] args) {
        // Тестируем методы
        printStringNTimes(3, "Hello, братан!");

        int[] arr1 = {1, 6, 8, 3, 10, 2};
        sumGreaterThanFive(arr1);

        int[] arr2 = new int[5];
        fillArray(7, arr2);

        int[] arr3 = {2, 4, 6, 8, 10};
        increaseEachElement(3, arr3);

        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8};
        compareHalves(arr4);
    }

    // Метод, печатающий строку n раз
    public static void printStringNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    // Метод, суммирующий все элементы массива, которые больше 5
    public static void sumGreaterThanFive(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 5) {
                sum += num;
            }
        }
        System.out.println("Сумма элементов больше 5: " + sum);
    }

    // Метод, заполняющий массив указанным числом
    public static void fillArray(int num, int[] arr) {
        Arrays.fill(arr, num);
        System.out.println("Заполненный массив: " + Arrays.toString(arr));
    }

    // Метод, увеличивающий каждый элемент массива на указанное число
    public static void increaseEachElement(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += num;
        }
        System.out.println("Массив после увеличения: " + Arrays.toString(arr));
    }

    // Метод, определяющий, сумма какой половины массива больше
    public static void compareHalves(int[] arr) {
        int mid = arr.length / 2;
        int sumFirstHalf = 0, sumSecondHalf = 0;

        for (int i = 0; i < mid; i++) {
            sumFirstHalf += arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            sumSecondHalf += arr[i];
        }

        if (sumFirstHalf > sumSecondHalf) {
            System.out.println("Первая половина имеет большую сумму: " + sumFirstHalf);
        } else if (sumSecondHalf > sumFirstHalf) {
            System.out.println("Вторая половина имеет большую сумму: " + sumSecondHalf);
        } else {
            System.out.println("Суммы половин равны: " + sumFirstHalf);
        }
    }
}
