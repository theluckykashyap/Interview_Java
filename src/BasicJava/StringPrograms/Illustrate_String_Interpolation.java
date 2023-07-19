package BasicJava.StringPrograms;

import java.text.MessageFormat;

//Java Program to Illustrate String Interpolation
public class Illustrate_String_Interpolation {
    public static void main(String[] args) {
        /*Using the ‘+’ operator
        Using  format() function
        Using MessageFormat class
        Using StringBuilder Class*/

        //1.using the + operator
        String str=" Core ";
        String str1= "best program. ";
        System.out.println(str+"java "+str1);
        //2.  using format() function
        System.out.println(String.format("%s java %s",str,str1));
        //3.MessageFormat class
        System.out.println(MessageFormat.format("{0}best version {0},coding {1}",str,str1));
        //4. Using StringBuilder Class
        System.out.println(new StringBuilder(str).append("java jav ajja ").append(str1 ).append(" ."));
    }
}
