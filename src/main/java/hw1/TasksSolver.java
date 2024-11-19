package hw1;

public class TasksSolver {
    public String method1(int a) {
        if (a % 2 == 0) {
            return "Четное";
        } else {
            return "Нечетное";
        }
    }

    public int sum(int a, int b) {
        return a + b;
    }

    /**
     Задача 1: Проверка делимости на 5 и 7
     Напишите функцию, которая принимает целое число и возвращает true,
     если оно делится на 5 и на 7 одновременно, и false в противном случае.
     */
    public boolean divideBy5And7(int a) {
        return (a % 5 == 0) && (a % 7 == 0);
    }

    /**
     * Задача 2: Определение принадлежности числа интервалу
     * Создайте функцию, которая принимает число и проверяет,
     * входит ли оно в интервал от 10 до 20 включительно.
     * Если число попадает в интервал, верните true, иначе — false.
     */
    public boolean isInInterval(int a) {
        return (a >= 20) && (a <= 30);
    }

    /**
     Задача 3: Проверка на квадрат числа
     Напишите функцию, которая принимает два числа и возвращает true, если
     одно из чисел является квадратом другого, и false в противном случае.
     */
    public boolean isSquare(int a, int b) {
        int base = a, square = b;
        if (base > square) {
            int temp = base;
            base = square;
            square = temp;
        }
        return base * base == square;
    }

    /**
     Задача 4: Проверка последней цифры
     Создайте функцию, которая принимает число и проверяет, заканчивается ли
     оно на 5. Верните true, если заканчивается, и false, если нет.
     */
    public boolean isEnded5(int a) {
        return (a % 10 == 5);
    }

    /**
     Задача 5: Проверка, является ли сумма цифр четной
     Реализуйте функцию, которая принимает число, суммирует его цифры и
     возвращает true, если сумма четная, и false, если нечетная.
     */
    public boolean isSumOfDigitEven(int a) {
        int modulo;
        int sum = 0;
        do {
            modulo = a % 10;
            sum += modulo;
            a = a / 10;
        } while (a > 9);
        sum += a;
        return sum % 2 == 0;
    }

    /**
     Задача 6: Сравнение двух чисел по модулю
     Напишите функцию, которая принимает два числа и возвращает true, если модули чисел равны, и false в противном случае.
     */
    public boolean isNumbersByAbsAreEquals(int a, int b) {
        return Math.abs(a) == Math.abs(b);
    }

    /**
     Задача 7: Проверка знака числа
     Создайте функцию, которая принимает число и возвращает "Positive",
     если оно положительное, "Negative", если оно отрицательное, и "Zero",
     если оно равно нулю.
    */
    public String signOfNumber(int a) {
        if (a > 0) {
            return "Positive";
        } else if (a < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /**
     Задача 8: Проверка делимости на 2 или 3
     Напишите функцию, которая принимает число и возвращает true, если оно делится на 2 или на 3, и false в противном случае.
     */
    public boolean isDivideBy2Or3(int a) {
        return a % 2 == 0 || a % 3 == 0;
    }

    /**
     Задача 9: Четность суммы двух чисел
     Создайте функцию, которая принимает два числа и возвращает "Even", если сумма чисел четная, и "Odd", если нечетная.
     */
    public String evenSum(int a, int b) {
        int sum = a + b;
        if (sum % 2 == 0) {
            return "Even";
        }
        else {
            return "Odd";
        }
    }

    /**
     Задача 10: Определение числа, кратного и 4, и 6
     Создайте функцию, которая проверяет, делится ли число на 4 и на 6
     одновременно. Верните true, если да, и false, если нет.
     */
    public boolean isDivideBy4And6(int a) {
        return a % 4 == 0 && a % 6 == 0;
    }

    /**
     Задача 11: Проверка суммы на четность и кратность 10
     Реализуйте функцию, которая принимает два числа и возвращает "Even and Divisible by 10", если их сумма четная и делится на 10, "Even but not Divisible by 10", если сумма четная, но не делится на 10, и "Odd", если сумма нечетная.
     */
    public String evenAndDivisibleBy10(int a) {
        if (a % 10 == 0) {
            return "Even and divisible by 10";
        }
        if (a % 2 == 0) {
            return "Even but not Divisible by 10";
        }
        else {
            return "Odd";
        }
    }

    /**
     Задача 12: Максимум трех чисел
     Напишите функцию, которая принимает три числа и возвращает наибольшее из них.
    */
    public int maxOfThreeNumbers(int a, int b, int c) {
        int max = a;
        if (b > a) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public int maxOfThreeNumbersV2(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }


    /**
     Задача 13: Проверка на палиндромность числа
     Создайте функцию, которая принимает целое число и проверяет, является ли оно палиндромом (например, 121 или 12321). Верните true, если да, и false, если нет.
    */
    public boolean isPalindrome(int a) {
        if (a < 0) return false; // Negative number is not palindrome
        char[] c = String.valueOf(a).toCharArray();
        boolean palindrome = true;
        for (int i = 0; i < c.length / 2; i++) {
            if (c[i] != c[c.length - 1 - i]) {
                palindrome = false;
            }
        }
        return palindrome;
    }

    public boolean isPalindromeV2(int a) {
        if (a < 0) return false; // Negative number is not palindrome
        String s = String.valueOf(a);
        String sReversed = new StringBuilder(s).reverse().toString();
        return s.equals(sReversed);
    }

    /**
     Задача 14: Кратность чисел и их сумма
     Реализуйте функцию, которая принимает два числа. Если оба числа кратны 3,
     верните их сумму; если одно из них кратно 3, верните удвоенное значение
     второго числа; если ни одно не кратно 3, верните null.
     */
    public Integer multiple3(int a, int b) {
        if (a % 3 == 0 && b % 3 == 0) {
            return a + b;
        }
        if (a % 3 == 0 || b % 3 == 0) {
            return 2 * b;
        }
        return null;
    }

    /**
     Задача 15: Проверка возраста на категорию
     Напишите функцию, которая принимает возраст и возвращает категорию:
     Child (до 12 лет), Teenager (от 13 до 17 лет), Adult (от 18 до 64 лет)
     или Senior (от 65 лет и старше).
     */
    public Age categorise(int a) {
        if (a >= 0 && a <= 12) {
            return Age.Child;
        }
        if (a >= 13 && a <= 17) {
            return Age.Teenager;
        }
        if (a >= 18 && a <= 64) {
            return Age.Adult;
        }
        return Age.Senior;
    }

    /**
     Задача 16: Проверка на делимость с остальным значением
     Создайте функцию, которая принимает два числа и проверяет, делится ли
     первое число на второе с остатком равным 2. Верните true, если делится
     с остатком 2, и false — если нет.
     */
    public boolean isMultiplePlus2(int a, int b) {
        return a % b == 2;
    }

}
