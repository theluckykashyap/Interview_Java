package BasicJava.Arrray;

import java.util.Collections;
import java.util.Vector;

public class Array2D {
    public static void main(String[] args)  throws java.lang.Exception{
        int[][] arr
                = { { 5, 2, 0, 7, 1 }, { 3, 4, 2, 9, 14 },
                { 5, 1, 3, 5, 2 }, { 4, 2, 6, 2, 1 },
                { 0, 6, 3, 5, 1 }, { 1, 4, 7, 2, 8 } };
        System.out.println("Matrix without sorting \n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                // Printing elements
                System.out.print(arr[i][j] + " ");
            }

            // By now we are done with one row so
            // new line is needed
            System.out.println();
        }
        // Creating an object of Vector class
        Vector<Integer> v = new Vector<>();

        // Adding elements of diagonal in vector
        // using add() method
        for (int i = 0; i < 5; i++) {
            v.add(arr[i][i]);
        }

        // Sorting elements in vector
        // using Collections.sort() method
        Collections.sort(v);

        for (int j = 0; j < 5; j++) {
            arr[j][j] = v.get(j);
        }
        System.out.println("Matrix after sorting \n");

        // Nested for loops to display 2D matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
