package BasicJava;

public class Break_Continue {
    public static void main(String[] args) {
        int age =40;
        for (int i=0;i<=age;i++ ){
            if (i == 10){
                continue;

            }
            System.out.println("continue statement " +i);
         if (i==18){
                break;
            }
            System.out.println("Break statement "+i);

         }
    }
}
