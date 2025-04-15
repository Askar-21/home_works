package HW3;

public class MainAppication {
    public static void main(String[] args) {
        int[][] array = {
                {1, -2, 3},
                {4, 5, -6},
                {-7, 8, 9}
        };

        // Тест sumOfPositiveElements
        System.out.println("Сумма положительных элементов: " + sumOfPositiveElements(array));

        // Тест printSquare
        System.out.println("\nКвадрат 5x5:");
        printSquare(5);

        // Тест nullifyDiagonals
        System.out.println("\nМатрица после зануления диагоналей:");
        nullifyDiagonals(array);
        printArray(array);

        // Тест findMax
        System.out.println("\nМаксимальный элемент: " + findMax(array));

        // Тест sumSecondRow
        System.out.println("\nСумма второй строки: " + sumSecondRow(array));
    }

    // 1. Метод для суммы положительных элементов массива
    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int num : row) {
                if (num > 0) {
                    sum += num;
                }
            }
        }
        return sum;
    }

    // 2. Метод для печати квадрата из *
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Метод для зануления диагональных элементов
    public static void nullifyDiagonals(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (i < array[i].length) {
                array[i][i] = 0; // Главная диагональ
                array[i][array[i].length - 1 - i] = 0; // Побочная диагональ
            }
        }
    }

    // 4. Метод для поиска максимального элемента
    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] row : array) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    // 5. Метод для суммы элементов второй строки
    public static int sumSecondRow(int[][] array) {
        if (array.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int num : array[1]) {
            sum += num;
        }
        return sum;
    }

    // Вспомогательный метод для печати массива
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}



