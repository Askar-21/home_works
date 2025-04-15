package HW11;

import java.io.*;
import java.nio.file.*;

public class TextFileHandler {
    private final String fileName;

    public TextFileHandler(String fileName) {
        this.fileName = fileName;
    }

    public void displayFileContent() {
        System.out.println("Содержимое файла " + fileName + ":");
        Path path = Paths.get(fileName);
        if (Files.exists(path)) {
            try {
                Files.lines(path).forEach(System.out::println);
            } catch (IOException e) {
                System.out.println("Ошибка при чтении файла: " + e.getMessage());
            }
        } else {
            System.out.println("Файл не существует.");
        }
    }

    public void writeToFile(String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(text);
            writer.newLine();
            System.out.println("Строка успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
