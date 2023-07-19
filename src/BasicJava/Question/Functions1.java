package BasicJava.Question;

import java.util.Scanner;

public class Functions1 {
    public static  int sumOfNumbers(int a,int b){
        int sum =a+b;
        return sum;
    }
    public static  int multiplyOfTwoNumbers(int a,int b){
        int multi =a*b;
        System.out.println("multiply of two numbers");
        return multi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your 1st number");
        int a=sc.nextInt();
        System.out.println("enter your 2nd number ");
        int b=sc.nextInt();

        System.out.println( sumOfNumbers(a,b));
        System.out.println(multiplyOfTwoNumbers(a,b));
    }
}
