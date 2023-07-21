package BasicJava.Java2Blog;

import org.w3c.dom.ls.LSOutput;

import java.util.*;


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
    private static boolean isUniueString(String str1) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int a = 0; a < str1.length(); a++) {
            char aa = str1.charAt(a);
            if (hashSet.add(aa))
                return true;


        }
        return false;
    }

    //Question 4 : How to check if one String is rotation of another String in java?
    private static boolean isRotations(String rotation, String rotation1) {
        if (rotation.length() != rotation1.length()) {
            return false;
        }
        String TwoString = rotation + rotation;
        return TwoString.contains(rotation1);

    }

    //Question 5 : How to find duplicate characters in String in java?

    /* hashMap Method( private HashMap<Character,Integer>isDuplicateCharacters) showing the duplicateCharacters
      like this from c  :  2
     u  :  1
     y  :  1
     k  :  1
     L  :  1*/
    private HashMap<Character, Integer> isDuplicateCharacters(String str) {
        HashMap<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);

            if (map.containsKey(a)) {
                int num = map.get(a);
                num = num + 1;
                map.put(a, num);
            } else
                map.put(a, 1);

        }
//        if (map.size()==str.length())
//            return true;
//
//        return false;
        return map;
    }

    //this method ( boolean isDuplicateCharacters) only showing its is duplicate or not

    private boolean isDuplicateCharacters1(String str) {
        if (str.isEmpty()) {
            return false;
        }
        HashSet<Character> hashSet = new HashSet<>();
        for (int k = 0; k < str.length(); k++) {
            char a = str.charAt(k);
            hashSet.add(a);
        }
        if (hashSet.size() != str.length()) {
            return true;
        }
        return false;
    }

    //Question 6 : Find first non repeated character in String in java?
    private HashSet<Character> IsNonRepeated(String str) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int k = 0; k < str.length(); k++) {
            char a = str.charAt(k);
            if (hashSet.contains(a)) {
                break;
            } else hashSet.add(a);

        }
        return hashSet;
    }

    //Question 7 : Find all substrings of String in java?
    private static String AllSubString(String subString) {

        for (int i = 0; i < subString.length(); i++) {
            for (int k = i + 1; k < subString.length(); k++) {
                String newSubString = null;
                newSubString = subString.substring(i, k);
                return newSubString;
            }


        }
        return AllSubString(subString);

    }


    public static void main(String[] args) {
        String str = "Luccky";
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
        String str1 = "Lucky";
        if (isUniueString(str1)) {
            System.out.println(str1 + " string is Unique ");
        } else System.out.println(str1 + " String is not Unique");

        //Question 4 : How to check if one String is rotation of another String in java?
        String rotation = "rotation";
        String rotation1 = "tionrota";
        if (isRotations(rotation, rotation1)) {
            System.out.println("String is Rotation");
        } else {
            System.out.println("String is not Rotation");
        }

        //Question 5 : How to find duplicate characters in String in java?

        Simple simple = new Simple();
        HashMap<Character, Integer> map = simple.isDuplicateCharacters(str);
        for (Map.Entry<Character, Integer> map1 : map.entrySet()
        ) {
            System.out.println(map1.getKey() + "  :  " + map1.getValue());

        }
        // 2nd method isDuplicateCharacters1
        if (simple.isDuplicateCharacters1(str)) {
            System.out.println(str + " String is duplicate");
        } else System.out.println(str + " String is not   duplicate");


        // Question 6 : Find first non repeated character in String in java?
        HashSet<Character> repeated = simple.IsNonRepeated(str);
        System.out.println(" This is my String " + str);
        for (Character re : repeated
        ) {
            System.out.println("  first non repeated character in String -: " + re);
        }
        // //Question 7 : Find all substrings of String in java?
        String subString = "abcd";
        String str5 = AllSubString(subString);
        System.out.println(str5);
    }
}

