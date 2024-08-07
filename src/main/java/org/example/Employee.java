package org.example;

public class Employee {
    private final String fullName;
    private final String position;
    private final String email;
    private final String phoneNumber;
    private final int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Створення об'єкта "Співробітник" у методі main
        Employee employee = new Employee("Іванов Іван", "Менеджер", "ivanov@example.com", "123456789", 30);

        // Виведення інформації про співробітника
        System.out.println("Інформація про співробітника:");
        System.out.println("ПІБ: " + employee.getFullName());
        System.out.println("Посада: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Телефон: " + employee.getPhoneNumber());
        System.out.println("Вік: " + employee.getAge());
    }
}