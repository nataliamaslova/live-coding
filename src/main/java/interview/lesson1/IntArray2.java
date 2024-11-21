package interview.lesson1;

import java.util.ArrayList;
import java.util.List;

public class IntArray2 {
    private List<Integer> iArray = new ArrayList<>(List.of(-33, 7, 9, 21));

    public Integer sumOfArray() {
        int s = 0;
        for (Integer i : iArray) {
            if (i > 100 || i < 0) {
                System.out.println("Error");
                continue;
            }
            s += i;
        }
        return s;
    }
}
