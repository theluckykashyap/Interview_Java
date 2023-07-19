package BasicJava.Arrray;

import java.util.Arrays;

public class Smallest_Element_Kth {

    public static int kthSmallest(Integer arr[],int k) {

        Arrays.sort(arr);

        return (k-1);
    }
    public static void main(String[] args) {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        int K = 2;

        // Function call
        System.out.print("K'th smallest element is "
                + kthSmallest(arr, K));
    }
}
