package leetcode;

import java.util.HashMap;
import java.util.Map;


/**
 * Problem statement link : https://leetcode.com/problems/roman-to-integer/
 * Solution : https://www.youtube.com/watch?v=Xy1dfcg7P-Y
 */
public class RomanToInteger13 {

    public static void main(String[] args) {

        String inputString = "IV";
        System.out.println(romanToInt(inputString));
    }

    public static int romanToInt(String s) {

        if (s == null || s.length() == 0) return 0;

        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int length = s.length();
        int result = hm.get(s.charAt(length - 1));
        System.out.println("Result: " + result);

        for (int i = s.length() - 2; i >= 0; i--) {

            if (hm.get(s.charAt(i)) >= hm.get(s.charAt(i + 1))) {
                result = result + hm.get(s.charAt(i));
            } else {
                result = result - hm.get(s.charAt(i));
            }
        }

        return result;
    }
}
