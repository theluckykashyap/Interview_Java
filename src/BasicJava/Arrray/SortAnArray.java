package BasicJava.Arrray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortAnArray implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1 - i2;
    }



    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 5, 1, 3);

        numbers.sort(new  SortAnArray());
          System.out.println(numbers); // [1, 2, 3, 4, 5]*/

    }
}
