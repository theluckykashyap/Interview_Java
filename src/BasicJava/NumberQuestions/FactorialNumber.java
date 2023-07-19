package BasicJava.NumberQuestions;

public class FactorialNumber {
    public static void main(String[] args) {
        int num =5;
        int a=1;
        for (int i=1;i<=num;i++){

             a=a*i;

        }
        System.out.print( "Factorial of "+num+" :"+a);
    }
}
