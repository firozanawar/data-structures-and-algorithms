package leetcode;

import java.util.HashMap;

/**
 * Problem statement link : https://leetcode.com/problems/two-sum/
 * Solution : https://www.callicoder.com/two-sum-problem/
 */
public class TwoSum1 {

    public static void main(String[] args) {

        int[] inputArray = {2, 7, 11, 15};
        int target = 9;

        int[] outPut = twoSum(inputArray, target);
        System.out.println(outPut[0]+ " "+outPut[1]);
    }

    // Time complexity: O(n)
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (hm.containsKey(complement)) {
                return new int[]{hm.get(complement), i};
            } else {
                hm.put(nums[i], i);
            }
        }

        return new int[]{};
    }

    // Time complexity: O(n^2)
    private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}