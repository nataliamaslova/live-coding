package hw2;

/**
 Задача 15. Класс "Круг"
 Создайте класс Circle с полями:
 radius (радиус, тип double).
 Реализуйте:
 Конструктор с параметром radius.
 Методы:
 calculateCircumference(), возвращает длину окружности.
 calculateArea(), возвращает площадь круга.
 Метод printCircleInfo(), который выводит:
 Круг: Радиус = <radius>, Площадь = <area>, Длина окружности = <circumference>

 В методе main создайте круг и выведите его данные.
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void printCircleInfo() {
        System.out.printf("Круг: Радиус = %.2f, Площадь = %.2f, " +
                "Длина окружности = %.2f", this.radius, this.calculateArea(),
                this.calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.printCircleInfo();
    }
}
