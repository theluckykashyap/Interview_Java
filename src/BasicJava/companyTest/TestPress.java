package BasicJava.companyTest;

import java.util.Arrays;
import java.util.Comparator;

public class TestPress {
    public static void main(String[] args) {


/*    1. Write a program to print the reverse of the given string
    Input codecode
    Output edocedoc
*/

        String input = "codecode";
        StringBuffer stringBuffer = new StringBuffer(input);
        String str = String.valueOf(stringBuffer.reverse());
        System.out.println(str);

/*     Questions :-   2. Given a number, check whether it is a prime number or not.
       1. Input
        3
        Output 1
        Yes
        2.Input
        4
        Output 2
        No
*/
        int number = 3;
        if (number % 2 == 0) {
            System.out.println("No");
        } else System.out.println("Yes");

/*        Given an array of numbers, arrange them in a way that it forms the largest value.
        Input
                [54, 546, 548, 60]
        Output
        6054854654
*/
        Integer[] arr = {54, 546, 548, 60};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String str = String.valueOf(o1);
                String str1 = String.valueOf(o2);
                return (str1 + str).compareTo(str + str1);
            }
        });

        StringBuilder value = new StringBuilder();
        for (int num : arr) {
            value = value.append(num);

        }
        System.out.println(value);

/*
        4. Given a number N, print reverse of number N.
        Input
        988
        Output
        889
*/

        int num = 988;

        String stringNum = String.valueOf(num);
        StringBuffer num1 = new StringBuffer(stringNum);
        num1.reverse();
        System.out.println(num1);

/*        5. Given an array of numbers, find the maximum and minimum element in the array.
        Input
                [54, 546, 548, 60]
        Output
       548 54
*/
        int[] arr1 = {54, 546, 548, 60};
        int max = arr1[0];
        int min = arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }

        System.out.print(max + "  " + min);

    }
}
