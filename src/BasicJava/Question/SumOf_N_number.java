package BasicJava.Question;

public class SumOf_N_number {
    public static void main(String[] args) {
        int sum=0;
        int n=20;
        for (int i=1;i<=n; i++){
            sum =sum+i;
        }
        System.out.println("Sum of Nth Number "+sum);
    }
}
