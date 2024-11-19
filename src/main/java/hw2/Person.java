package hw2;

/**
 Задача 2. Класс "Человек"

 Создайте класс Person с полями:
 name (имя, тип String),
 age (возраст, тип int),
 gender (пол, тип String).
 Реализуйте:
 Конструктор с параметрами name и age.
 Конструктор по умолчанию (без параметров).
 Геттеры и сеттеры.
 Добавьте метод printInfo(), который выводит информацию о человеке в формате:
 Имя: <name>, Возраст: <age>, Пол: <gender>

 В методе main создайте несколько объектов класса Person, вызовите метод
 sprintInfo() для каждого объекта.

 */
public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {}

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printInfo() {
        System.out.printf("Name: %s, hw1.Age: %d, Gender: %s\n",
                this.getName(), this.getAge(), this.getGender());
    }

    public static void main(String[] args) {
        Person olga = new Person("Olga", 21);
        olga.setGender("w");
        Person peter = new Person("Peter", 25);
        peter.setGender("m");
        olga.printInfo();
        peter.printInfo();
    }
}
