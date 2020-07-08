package leetcode;

/**
 * Problem statement link : https://leetcode.com/problems/reverse-integer/
 * Solution :
 */
public class ReverseInteger7 {

    public static void main(String[] args) {
        int number  = 120;
        System.out.println(reverse(number));
    }

    public static int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
