package BasicJava.NumberQuestions;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int n = number;
        int sum = 0;
        while (number > 0) {
            int Armstrong = number % 10;

            sum = sum + (Armstrong * Armstrong * Armstrong);
            number = number / 10;
        }
        if (n == sum) System.out.println("number is armstrong " + sum);
        else System.out.println("number is  not armstrong " + sum);


        while (number > 0) {
            int Armstrong = number % 10;
            sum = (int) (sum + Math.pow(3, Armstrong));
            number = number / 10;

        }
        if (n == sum) System.out.println("number is armstrong " + sum);
        else System.out.println("number is  not armstrong " + sum);


    }
}

