public class Main {
    public static void main(String[] args) {
        Exprompt exprompt = new Exprompt();
        System.out.println(exprompt.divideBy3And5(15));
        System.out.println(exprompt.divideBy3And5(20));

        Person sasha = new Person("Alex", 18);
        sasha.print();
        sasha.celebrate();
        sasha.print();
    }
}
