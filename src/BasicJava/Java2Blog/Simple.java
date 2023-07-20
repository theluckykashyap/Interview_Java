package BasicJava.Java2Blog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;




public class Simple {
//Question 1 : How to reverse a String in java? Can you write a program without using any java inbuilt methods?

    public static List<String> reverseString(String str) {
        // using StringBuffer
        List<String> allOut = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer(str);
        String str1 = String.valueOf(stringBuffer.reverse());
        allOut.add(str1);
        // using for loop
        String strLoop = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strLoop = strLoop + String.valueOf((str.charAt(i)));

        }
        allOut.add(strLoop);


        return allOut;
    }

    // Questions:-2  check if two Strings are anagram in java.

    public static boolean isAnagram(String anagram, String anagram1) {

        Stack<Character> stack = new Stack<>();
        if (anagram.equals(anagram1)) {

            for (int i = 0; i < anagram.length(); i++) {
                stack.push(Character.valueOf(anagram.charAt(i)));
                for (int k = 0; k < anagram.length(); k++) {
                    if (stack.peek() == anagram1.charAt(i)) {
                        stack.pop();
                        return true;
                    } else return false;


                }
            }

            return true;

        } else {
            return false;
        }


    }
    // Question 3 : Write a program to check if String has all unique characters in java?
    private static boolean isUniueString (String str1) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int a = 0; a < str1.length(); a++) {
            char aa = str1.charAt(a);
            if (hashSet.add(aa))
                return true;


        }
        return false;
    }






    public static void main(String[] args) {
        String str = "Lucky";
        List<String> stringList = reverseString(str);
        for (String s : stringList
        ) {
            System.out.println(str + "  -->:" + s);


        }
        // questions 2
        String anagram = "alppe";
        String anagram1 = "apple";
        if (isAnagram(anagram, anagram1) == true) {
            System.out.println(anagram + " string is Anagram ");
        } else System.out.println(anagram + " String is not Anagram");

        // Question 3 : Write a program to check if String has all unique characters in java?
              String str1= "Lucky";
              if (isUniueString(str1)) {
                  System.out.println(str1 + " string is Unique ");
              } else System.out.println(str1 + " String is not Unique");


    }
}

