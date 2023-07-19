package BasicJava.Question;

import java.util.Scanner;

public class TableOf_A_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter your table name ");
        int n = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
