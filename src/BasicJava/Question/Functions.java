package BasicJava.Question;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Functions {

    public static  void printOfName(String Name){
        System.out.println(Name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name ");
       String  Name = sc.next();

       printOfName(Name);

    }
}
