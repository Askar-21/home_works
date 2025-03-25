package HW8;

import java.util.*;

public class EmployeeProcessor {
    public static List<String> getEmployeeNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee emp : employees) {
            names.add(emp.getName());
        }
        return names;
    }

    public static List<Employee> filterEmployeesByAge(List<Employee> employees, int minAge) {
        List<Employee> filtered = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getAge() >= minAge) {
                filtered.add(emp);
            }
        }
        return filtered;
    }

    public static boolean hasYoungerThanAverage(List<Employee> employees, int avgAge) {
        int sumAge = employees.stream().mapToInt(Employee::getAge).sum();
        double calculatedAvg = (double) sumAge / employees.size();
        return calculatedAvg < avgAge;
    }

    public static Employee getYoungestEmployee(List<Employee> employees) {
        return Collections.min(employees, Comparator.comparingInt(Employee::getAge));
    }
}