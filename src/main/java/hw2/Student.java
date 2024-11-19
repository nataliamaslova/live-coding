package hw2;

import java.util.ArrayList;
import java.util.List;

/**
 Задача 5. Класс "Студент"
 Создайте класс Student с полями:
 name (имя, тип String),
 studentId (идентификатор студента, тип int),
 gpa (средний балл, тип double).
 Реализуйте:
 Конструктор для всех полей.
 Геттеры и сеттеры.
 Метод printStudentDetails(), который выводит:
 Студент: <name>, ID: <studentId>, GPA: <gpa>

 В методе main создайте массив из объектов Student, заполните его, и выведите данные каждого студента.

 */
public class Student {
    String name;
    int studentId;
    double gpa;

    public Student(String name, int studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printStudentDetails() {
        System.out.printf("Студент: %s, ID: %d, GPA: %.1f\n",
                getName(), getStudentId(), getGpa());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student oksana = new Student("Oksana", 425, 4.7);
        Student oleg = new Student("Oleg", 426, 4.3);
        Student phillip = new Student("Phillip", 427, 3.2);
        Student maya = new Student("Maya", 428, 4.2);
        Student denis = new Student("Denis", 429, 4.8);
        students.add(oksana);
        students.add(oleg);
        students.add(phillip);
        students.add(maya);
        students.add(denis);

        for (Student i : students) {
            i.printStudentDetails();
        }
    }
}
