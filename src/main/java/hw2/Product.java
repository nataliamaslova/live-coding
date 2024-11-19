package hw2;

/**
 Задача 4. Класс "Товар"

 Создайте класс Product с полями:
 name (название товара, тип String),
 category (категория товара, тип String),
 quantity (количество, тип int),
 pricePerUnit (цена за единицу, тип double).
 Реализуйте:
 Конструктор с параметрами для всех полей.
 Геттеры и сеттеры.
 Метод calculateTotalPrice(), который возвращает общую стоимость товара (quantity * pricePerUnit).
 Метод printProductInfo(), который выводит:
 Товар: <name>, Категория: <category>, Количество: <quantity>, Общая стоимость: <totalPrice>

 В методе main создайте объект, измените количество через сеттер, а затем выведите полную информацию о товаре.
 */
public class Product {
    private String name;
    private String category;
    private int quantity;
    private double pricePerUnit;

    public Product(String name, String category, int quantity, double pricePerUnit) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double calculateTotalPrice() {
        return this.pricePerUnit * this.quantity;
    }

    public void printProductInfo() {
        System.out.printf("Товар: %s, Категория: %s, Количество: %d, Общая стоимость: %.2f\n",
                this.name, this.category, this.quantity, calculateTotalPrice());
    }

    public static void main(String[] args) {
        Product product = new Product("Гречка", "Крупы", 2, 3.7);
        product.printProductInfo();
        product.setQuantity(5);
        product.printProductInfo();
    }
}
