package kz.kaznu.askar.HW1;
import java.util.Scanner; // Добавил импорт Scanner
public class MainApplication { // Оставил твое название класса
    public static void main(String[] args) {
        // Вызов всех заданий
        greetings();
        checkSign();
//        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(8, 2, true);
    }

    // Печать приветствия
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    // Проверка знака суммы
    public static void checkSign() {
        int a = -3;
        int b = -5;
        int c = 7;
        int sum = a + b + c;

        // Вывод сообщения о знаке суммы
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //  Выбор цвета по введенному числу
    public static void selectColor() {
        Scanner scanner = new Scanner(System.in);  // Создаем объект для ввода данных
        System.out.print("Введите число: ");

        // Проверка на корректный ввод числа
        if (scanner.hasNextInt()) {
            int data = scanner.nextInt();
            if (data <= 10) {
                System.out.println("КРАСНЫЙ");
            } else if (data > 10 && data <= 20) {
                System.out.println("ЖЕЛТЫЙ");
            } else {
                System.out.println("ЗЕЛЕНЫЙ");
            }
        } else {
            System.out.println("Ошибка ввода! Введите целое число.");
        }

        scanner.close(); // Закрываем Scanner
    }

    //  Сравнение чисел a и b
    public static void compareNumbers() {
        int a = 5;
        int b = 6;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //  Добавление или вычитание чисел в зависимости от флага
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        // В зависимости от значения increment, либо прибавляем, либо вычитаем delta
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}