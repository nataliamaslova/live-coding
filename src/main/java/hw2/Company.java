package hw2;

/**
 Задача 14. Класс "Компания"
 Создайте класс Company с полями:
 name (название компании, тип String),
 employees (количество сотрудников, тип int),
 revenue (доход, тип double).
 Реализуйте:
 Конструктор для всех полей.
 Геттеры и сеттеры.
 Метод printCompanyInfo(), который выводит:
 Компания: <name>, Сотрудников: <employees>, Доход: <revenue>

 В методе main создайте объект компании и выведите его данные.
 */
public class Company {
    private String name;
    private int employees;
    private double revenue;

    public Company(String name, int employees, double revenue) {
        this.name = name;
        this.employees = employees;
        this.revenue = revenue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public void printCompanyInfo() {
        System.out.printf(" Компания: %s, Сотрудников: %d, Доход: %.2f",
                this.name, this.employees, this.revenue);
    }

    public static void main(String[] args) {
        Company company = new Company("Adidas", 1200, 2700300);
        company.printCompanyInfo();
    }
}

