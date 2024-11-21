package hw2;

/**
 Задача 12. Класс "Прямоугольник"
 Создайте класс Rectangle с полями:
 width (ширина, тип double),
 height (высота, тип double).
 Реализуйте:
 Конструктор с параметрами для всех полей.
 Геттеры и сеттеры.
 Методы:
 calculateArea(), возвращает площадь прямоугольника.
 calculatePerimeter(), возвращает периметр.
 Метод printRectangleInfo(), который выводит:
 Прямоугольник: Ширина = <width>, Высота = <height>, Площадь = <area>, Периметр = <perimeter>

 В методе main создайте объект, выведите его площадь и периметр.
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return this.height * this.width;
    }

    public double calculatePerimeter() {
        return 2 * (this.height + this.width);
    }

    public void printRectangleInfo() {
        System.out.printf("Прямоугольник: Ширина = %.2f, " + "Высота = %.2f, " +
                "Площадь = %.2f, Периметр = %.2f", this.width, this.height,
                this.calculateArea(), this.calculatePerimeter());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.printRectangleInfo();
    }
}
