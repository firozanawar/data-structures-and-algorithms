package leetcode;

/**
 * Problem statement link : https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(arr, target));
    }

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }
}
