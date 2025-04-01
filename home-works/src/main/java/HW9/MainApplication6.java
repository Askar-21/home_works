package HW9;

public class MainApplication6 {
    public static void main(String[] args) { // Исправлен метод main
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем контакты
        phoneBook.add("Иванов", "123456");
        phoneBook.add("Иванов", "654321");
        phoneBook.add("Петров", "987654");

        // Тестируем поиск
        System.out.println("Телефоны Иванова: " + phoneBook.find("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.find("Петров"));
        System.out.println("Телефоны Сидорова: " + phoneBook.find("Сидоров"));

        // Проверяем наличие номера
        System.out.println("Есть ли номер 123456? " + phoneBook.containsPhoneNumber("123456"));
        System.out.println("Есть ли номер 111111? " + phoneBook.containsPhoneNumber("111111"));

        // Вывод всех контактов
        phoneBook.printAllContacts();
    }
}
