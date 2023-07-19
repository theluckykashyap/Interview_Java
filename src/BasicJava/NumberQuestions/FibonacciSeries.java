package BasicJava.NumberQuestions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num =0,sum = 0;
        int num1 =1, num2=0;
      //  System.out.println(num);


        for (int i=1;i<=10;i++) {
            System.out.println(num);
            sum = num + num1;
            num=num1;
            num1=sum;


            // num=num+i;
            //  sum=num;

        }
//

    }
}
