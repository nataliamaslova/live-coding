package interview.lesson1;

/**
 Дан массив целых чисел со значениями в диапазоне от 0 до 100.
 Написать функцию для подсчета суммы.
 */
public class IntArray {
    private int[] array =  {-33, 7, 9, 21};

    public int sumOfArray() {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 100 || array[i] < 0) {
                System.out.println("Error");
                continue;
            }
            sum += array[i];
        }
        return sum;
    }
}
