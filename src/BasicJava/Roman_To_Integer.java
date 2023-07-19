package BasicJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Roman_To_Integer {
    public int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans =0;
        for (int i = 0; i < s.length(); i++) {
            int first = map.get(s.charAt(i));
            int second;
            if (i + 1 < s.length()) {
                second = map.get(s.charAt(i + 1));
                if (first < second) {
                    ans += (second - first);
                    i++;
                } else {
                    ans += first;
                }
            } else {
                ans += first;
            }

        }


        return ans;
    }

    public static void main(String[] args) {
        Roman_To_Integer romanToInteger = new Roman_To_Integer();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your Roman Number : ");
      String s =sc.nextLine();

        System.out.println("String "+s+ " = answer : "+romanToInteger.romanToInt(s));
    }
}