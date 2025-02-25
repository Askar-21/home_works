package Hw4;

import java.util.ArrayList;
import java.util.List;

public class MainApplication2 {
    public static void main(String[] args) {
        List<user> users = new ArrayList<>();
        users.add(new user("Иванов", "Иван", "Иванович", 1975, "ivanov@mail.com"));
        users.add(new user("Петров", "Петр", "Петрович", 1983, "petrov@mail.com"));
        users.add(new user("Сидоров", "Сидор", "Сидорович", 1990, "sidorov@mail.com"));
        users.add(new user("Кузнецов", "Алексей", "Алексеевич", 1980, "kuznetsov@mail.com"));
        users.add(new user("Смирнов", "Андрей", "Андреевич", 1965, "smirnov@mail.com"));
        users.add(new user("Федоров", "Владимир", "Владимирович", 2000, "fedorov@mail.com"));
        users.add(new user("Морозов", "Егор", "Егорович", 1995, "morozov@mail.com"));
        users.add(new user("Волков", "Дмитрий", "Дмитриевич", 1982, "volkov@mail.com"));
        users.add(new user("Зайцев", "Игорь", "Игоревич", 1970, "zaycev@mail.com"));
        users.add(new user("Соловьев", "Михаил", "Михайлович", 1968, "soloviev@mail.com"));

        System.out.println("Пользователи старше 40 лет:");
        for (user user : users) {
            if (user.getAge() > 40) {
                user.printInfo();
            }
        }

        System.out.println("Тестирование класса Коробка:");
        box box = new box(10, 15, 20, "Красная");
        box.open();
        box.putItem("Книга");
        box.close();
        box.open();
        box.removeItem();
        box.close();
    }
}
