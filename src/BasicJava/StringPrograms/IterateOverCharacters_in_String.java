package BasicJava.StringPrograms;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class IterateOverCharacters_in_String {
    public static void getChar(String str){

        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));

            System.out.print(" , ");
        }

    }
    public static  void getChar1(String str1){
        CharacterIterator itr= new StringCharacterIterator(str1);
        while (itr.current() != CharacterIterator.DONE){
            System.out.print(itr.current());
            System.out.println(" , ");
            itr.next();
        }
    }
    public static void main(String[] args) {
        // Creating a String variable to store the string
      String str= "luckyKashyap";
      String str1= "Apply";
        // Calling the getChar method
      getChar(str);
      getChar1(str1);
    }

}
