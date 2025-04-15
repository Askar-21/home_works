package HW11;

import java.io.File;

public class FileManager {
    public static void listTextFiles() {
        File dir = new File(".");
        File[] files = dir.listFiles((d, name) -> name.endsWith(".txt"));

        System.out.println("Список текстовых файлов в корневом каталоге:");
        if (files != null && files.length > 0) {
            for (File file : files) {
                System.out.println("- " + file.getName());
            }
        } else {
            System.out.println("Нет текстовых файлов.");
        }
    }
}
