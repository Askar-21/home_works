package Hw4;

import java.util.ArrayList;
import java.util.List;

public class MainApplication2 {
    // Класс пользователя
    static class User {
        private String lastName;
        private String firstName;
        private String middleName;
    private int  birthYear;
        private String email;

        public User(String lastName, String firstName, String middleName, int birthYear, String email) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.middleName = middleName;
            this.birthYear = birthYear;
            this.email = email;
        }

        public int getAge() {
            return 2024 - birthYear;
        }

        public void printInfo() {
            System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName);
            System.out.println("Год рождения: " + birthYear);
            System.out.println("E-mail: " + email);
            System.out.println("------------------------");
        }
    }

    // Класс коробки
    static class Box {
        private final double width;
        private final double height;
        private final double depth;
        private final String color;
        private boolean isOpen;
        private String item;

        public Box(double width, double height, double depth, String color) {
            this.width = width;
            this.height = height;
            this.depth = depth;
            this.color = color;
            this.isOpen = false;
            this.item = null;
        }

        public void open() {
            isOpen = true;
            System.out.println("Коробка открыта.");
        }

        public void close() {
            isOpen = false;
            System.out.println("Коробка закрыта.");
        }

        public void putItem(String item) {
            if (isOpen) {
                if (this.item == null) {
                    this.item = item;
                    System.out.println("В коробку помещен предмет: " + item);
                } else {
                    System.out.println("Коробка уже содержит предмет: " + this.item);
                }
            } else {
                System.out.println("Коробка закрыта. Откройте ее перед добавлением предмета.");
            }
        }

        public void removeItem() {
            if (isOpen) {
                if (this.item != null) {
                    System.out.println("Предмет " + this.item + " вынут из коробки.");
                    this.item = null;
                } else {
                    System.out.println("Коробка уже пустая.");
                }
            } else {
                System.out.println("Коробка закрыта. Откройте ее перед извлечением предмета.");
            }
        }
    }

    // Главный метод
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Иванов", "Иван", "Иванович", 1975, "ivanov@mail.com"));
        users.add(new User("Петров", "Петр", "Петрович", 1983, "petrov@mail.com"));
        users.add(new User("Сидоров", "Сидор", "Сидорович", 1990, "sidorov@mail.com"));
        users.add(new User("Кузнецов", "Алексей", "Алексеевич", 1980, "kuznetsov@mail.com"));
        users.add(new User("Смирнов", "Андрей", "Андреевич", 1965, "smirnov@mail.com"));
        users.add(new User("Федоров", "Владимир", "Владимирович", 2000, "fedorov@mail.com"));
        users.add(new User("Морозов", "Егор", "Егорович", 1995, "morozov@mail.com"));
        users.add(new User("Волков", "Дмитрий", "Дмитриевич", 1982, "volkov@mail.com"));
        users.add(new User("Зайцев", "Игорь", "Игоревич", 1970, "zaycev@mail.com"));
        users.add(new User("Соловьев", "Михаил", "Михайлович", 1968, "soloviev@mail.com"));

        System.out.println("Пользователи старше 40 лет:");
        for (User user : users) {
            if (user.getAge() > 40) {
                user.printInfo();
            }
        }

        System.out.println("Тестирование класса Коробка:");
        Box box = new Box(10, 15, 20, "Красная");
        box.open();
        box.putItem("Книга");
        box.close();
        box.open();
        box.removeItem();
        box.close();
    }
}
