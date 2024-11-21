package hw2;

/**
 Задача 9. Класс "Сотрудник"
 Создайте класс Employee с полями:
 name (имя сотрудника, тип String),
 position (должность, тип String),
 salary (зарплата, тип double).
 Реализуйте:
 Конструктор для всех полей.
 Геттеры и сеттеры.
 Метод increaseSalary(double percentage), который увеличивает зарплату на заданный процент.
 Метод printEmployeeInfo(), который выводит:
 Сотрудник: <name>, Должность: <position>, Зарплата: <salary>

 В методе main создайте нескольких сотрудников, увеличьте их зарплату и выведите их данные.
 */
public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        this.salary = this.salary * (1 + percentage / 100);
    }

    public void printEmployeeInfo() {
        System.out.printf("Сотрудник: %s, Должность: %s, Зарплата: %.2f\n", this.name, this.position, this.salary);
    }

    public static void main(String[] args) {
        Employee maria = new Employee("Maria", "manager", 3000.00);
        maria.printEmployeeInfo();
        maria.increaseSalary(15);
        maria.printEmployeeInfo();
        Employee maxim = new Employee("Maxim", "director", 5000.00);
        maxim.printEmployeeInfo();
        maxim.increaseSalary(10);
        maxim.printEmployeeInfo();
    }
}
