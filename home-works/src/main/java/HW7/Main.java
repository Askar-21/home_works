package HW7;

public class Main {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "X", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        processAndPrint(validArray);
        processAndPrint(invalidSizeArray);
        processAndPrint(invalidDataArray);
    }

    private static void processAndPrint(String[][] array) {
        try {
            System.out.println("Сумма элементов: " + ArrayProcessor.processArray(array));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
