package Hw4;

public class user {
    private String lastName;
    private String firstName;
    private String middleName;
    private int birthYear;
    private String email;

    public user(String lastName, String firstName, String middleName, int birthYear, String email) {
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
