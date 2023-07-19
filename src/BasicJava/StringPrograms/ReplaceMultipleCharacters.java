package BasicJava.StringPrograms;

import java.sql.SQLOutput;

public class ReplaceMultipleCharacters {
    public static void main(String[] args) {
        String str = "new String replace Multiple Characters ";
        //using replace () method
        System.out.println(""+str.replace("e","z"));
        // using replace all () method
        System.out.println(str.replaceAll("String ","String2222"));

        System.out.println(str.replaceFirst("new","First"));
    }
}
