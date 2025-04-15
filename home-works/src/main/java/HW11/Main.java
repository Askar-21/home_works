package HW11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileManager.listTextFiles();

        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        TextFileHandler fileHandler = new TextFileHandler(fileName);
        fileHandler.displayFileContent();

        System.out.print("Введите строку для записи в файл: ");
        String input = scanner.nextLine();
        fileHandler.writeToFile(input);
    }
}
