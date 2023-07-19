package BasicJava.Question;

import java.util.Scanner;

public class FactorialOf_A_Number {
    public static int factorial(int a){
        if (a<0){
            System.out.println("number is not valid");
            return a;
        }
        int fact=1;
        for (int i=a; i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        System.out.println(factorial(a));

    }
}
