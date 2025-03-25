package HW8;

import java.util.*;

public class MainApplication5 {
    public static void main(String[] args) {
        List<Integer> list = NumberListProcessor.generateList(1, 10);
        System.out.println("Сгенерированный список: " + list);
        System.out.println("Сумма элементов > 5: " + NumberListProcessor.sumGreaterThanFive(list));

        NumberListProcessor.fillListWithNumber(list, 7);
        System.out.println("Список после заполнения 7: " + list);

        NumberListProcessor.increaseEachElement(list, 3);
        System.out.println("Список после увеличения каждого элемента на 3: " + list);

        List<Employee> employees = Arrays.asList(
                new Employee("Джон", 25),
                new Employee("Алиса", 30),
                new Employee("Боб", 22)
        );

        System.out.println("Имена сотрудников: " + EmployeeProcessor.getEmployeeNames(employees));
        System.out.println("Сотрудники старше 24 лет: " + EmployeeProcessor.filterEmployeesByAge(employees, 24));
        System.out.println("Самый молодой сотрудник: " + EmployeeProcessor.getYoungestEmployee(employees).getName());
    }
}
