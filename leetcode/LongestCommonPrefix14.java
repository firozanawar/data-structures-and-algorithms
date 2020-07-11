package leetcode;

/**
 * Problem statement link : https://leetcode.com/problems/longest-common-prefix/
 * Solution : https://www.youtube.com/watch?v=1YQmI7F9dJ0
 */
public class LongestCommonPrefix14 {

    public static void main(String[] args) {

        String[] input = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] strs) {

        String result = "";
        if (strs == null || strs.length == 0) {
            return result;
        }

        int index = 0;
        for (char c : strs[0].toCharArray()) {
            for (int i = 1; i < strs.length; i++) {

                if (index >= strs[i].length() || c != strs[i].charAt(index)) {
                    return result;
                }
            }

            result += c;
            index++;
        }

        return result;
    }
}
