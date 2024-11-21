package hw2;

import java.util.ArrayList;
import java.util.List;

/**
 Задача 13. Класс "Клиент Интернет-магазина"
 Создайте класс Customer с полями:
 name (имя клиента, тип String),
 email (почта, тип String),
 purchaseHistory (история покупок, тип List<String>).
 Реализуйте:
 Конструктор для имени и почты.
 Методы:
 addPurchase(String item), добавляет товар в историю покупок.
 printPurchaseHistory(), выводит:
 Клиент: <name>, История покупок: <history>

 В методе main создайте клиента, добавьте несколько покупок и выведите историю.

 */
public class Customer {
    private String name;
    private String email;
    private List<String> purchaseHistory = new ArrayList<>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addPurchase(String item) {
        this.purchaseHistory.add(item);
    }

    public void printPurchaseHistory() {
        System.out.printf("Клиент: %s, История покупок: %s\n", this.name, this.purchaseHistory);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Игорь Смирнов", "igor.smirnov@gmail.com");
        customer.addPurchase("кроссовки");
        customer.addPurchase("куртка");
        customer.addPurchase("джинсы");
        customer.addPurchase("футболка");
        customer.printPurchaseHistory();
    }
}
