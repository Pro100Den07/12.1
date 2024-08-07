import org.example.Employee;

public class Main {

    public static void main(String[] args) {
        // Створення об'єкта "Співробітник"
        Employee employee = new Employee("Іванов Іван", "Менеджер", "ivanov@example.com", "123456789", 30);

        // Виведення інформації про співробітника
        System.out.println("Інформація про співробітника:");
        System.out.println("ПІБ: " + employee.getFullName());
        System.out.println("Посада: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Телефон: " + employee.getPhoneNumber());
        System.out.println("Вік: " + employee.getAge());

        // Створення об'єкта "Car" та запуск методу start()
        Car car = new Car();
        car.start();
    }
}