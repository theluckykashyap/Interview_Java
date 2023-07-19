package BasicJava.StringPrograms;

//How to Convert Char To String in java ?
public class Convert_char_to_String {
    public static void main(String[] args) {

        // Declaring a char variable
        char ch ='s';

        // Concatenating the char variable
        // with an empty string
        String str=" "+ch;

        //displaying the string str
        System.out.println(str);

        // using toSting() methods
    String str1 =Character.toString(ch);
        System.out.println(str1);

        //Using Character wrapper class



    }
}
