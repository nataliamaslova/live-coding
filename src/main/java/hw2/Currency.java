package hw2;

/**
 Задача 7. Класс "Курс Валют"
 Создайте класс Currency с полями:
 name (название валюты, тип String),
 rateToUSD (курс валюты к доллару США, тип double).
 Реализуйте:
 Конструктор для инициализации полей.
 Геттеры и сеттеры.
 Метод convertToUSD(double amount), который возвращает сумму в долларах для заданного количества валюты.
 Метод printCurrencyInfo(), который выводит:

 Валюта: <name>, Курс к USD: <rateToUSD>

 В методе main создайте объект валюты, выведите курс и выполните конвертацию заданной суммы в USD.
 */
public class Currency {
    private String name;
    private double rateToUSD;

    public Currency(String name, double rateToUSD) {
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }

    public void setRateToUSD(double rateToUSD) {
        this.rateToUSD = rateToUSD;
    }

    public double convertToUSD(double amount) {
        return amount * this.rateToUSD;
    }

    public void printCurrencyInfo() {
        System.out.printf("Валюта: %s, Курс к USD: %.2f", this.getName(), this.getRateToUSD());
    }

    public static void main(String[] args) {
        Currency currencyEuro = new Currency("EUR" , 1.06);
        Currency currencyPln = new Currency("PLN" , 0.24);

        currencyEuro.printCurrencyInfo();
        double amount = 100;
        System.out.println("\t" + amount + " EUR -> USD: " + currencyEuro.convertToUSD(amount));
        currencyPln.printCurrencyInfo();
        System.out.println("\t" + amount + " PLN -> USD: " + currencyPln.convertToUSD(amount));
    }
}
