package leetcode;

/**
 * Problem statement link : https://leetcode.com/problems/palindrome-number/
 * Solution :
 */
public class PalindromeNumber9 {

    public static void main(String[] args) {

        int number  = 121; // -121
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int x) {

        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        int pop = 0;
        while(x > revertedNumber){
            pop = x%10;
            x = x/10;
            revertedNumber = revertedNumber* 10 + pop;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }
}
