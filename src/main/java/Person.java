public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void celebrate() {
        this.age++;
    }

    public void print() {
        System.out.println("My name is: " + this.name + " I'm " + this.age + " years old.");
    }
}
