package hw2;

/**
 Задача 1. Создание класса "Книга"
 Создайте класс Book с полями:
 title (название книги, тип String),
 author (автор, тип String),
 price (цена, тип double).
 Реализуйте:
 Конструктор, который принимает все поля.
 Геттеры и сеттеры для каждого поля.

 В методе main создайте объект класса Book, измените через сеттеры автора и цену, а затем выведите в консоль информацию о книге.
 */
public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book[" + "title= " + this.title  + ", author= " + this.author
                + ", price= " + this.price + "]";
    }

    public static void main(String[] args) {
        Book book = new Book("Around the World in 80 Days", "not specified", 25.30);
        System.out.println(book);
        book.setAuthor("Jules Verne");
        book.setPrice(58.70);
        System.out.println(book);
    }
}
