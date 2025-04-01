package HW9;

import java.util.*;

    public class PhoneBook {
        private Map<String, Set<String>> contacts;

        public PhoneBook() {
            this.contacts = new HashMap<>();
        }

        // Метод для добавления контакта
        public void add(String name, String phoneNumber) {
            contacts.putIfAbsent(name, new HashSet<>());
            contacts.get(name).add(phoneNumber);
        }

        // Метод для поиска номеров по имени
        public Set<String> find(String name) {
            return contacts.getOrDefault(name, Collections.emptySet());
        }

        // Метод для проверки наличия номера в справочнике
        public boolean containsPhoneNumber(String phoneNumber) {
            return contacts.values().stream().anyMatch(set -> set.contains(phoneNumber));
        }

        // Вывод всех контактов
        public void printAllContacts() {
            for (Map.Entry<String, Set<String>> entry : contacts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

