package HW7;

public class ArrayProcessor {
    public static int processArray(String[][] array) throws AppArraySizeException, AppArrayDataException {
        if (array.length != 4) {
            throw new AppArraySizeException("Массив должен быть размером 4x4");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new AppArraySizeException("Ошибка в строке " + i + ": ожидалось 4 элемента, а найдено " + array[i].length);
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ошибка в ячейке [" + (i + 1) + "][" + (j + 1) + "]: '" + array[i][j] + "' – не число");
                }
            }
        }
        return sum;
    }
}

