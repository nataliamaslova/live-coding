package hw2;

/**
 Задача 8. Класс "Телефон"
 Создайте класс Phone с полями:
 brand (бренд телефона, тип String),
 model (модель телефона, тип String),
 price (цена телефона, тип double).
 Реализуйте:
 Конструктор для всех полей.
 Геттеры и сеттеры.
 Метод applyDiscount(double percentage), который уменьшает цену на заданный процент.
 Метод printPhoneDetails(), который выводит:
 Телефон: <brand> <model>, Цена: <price>
 В методе main создайте телефон, примените скидку и выведите его характеристики.
 */
public class Phone {
    private String brand;
    private String model;
    private double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        this.price = this.price * (100 - percentage) / 100;
    }

    public void printPhoneDetails() {
        System.out.printf("Телефон: %s, Модель: %s, Цена: %.2f\n",
                this.brand, this.model, this.price);
    }

    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", "KS 543", 877.99);
        phone.printPhoneDetails();
        phone.applyDiscount(3.5);
        phone.printPhoneDetails();
        phone.applyDiscount(7.3);
        phone.printPhoneDetails();
    }
}
