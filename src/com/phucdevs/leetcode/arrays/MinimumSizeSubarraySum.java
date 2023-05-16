package com.phucdevs.leetcode.arrays;

public class MinimumSizeSubarraySum {
    
    public static void main(String[] args) {
        
        /**
         * Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose
         * sum is greater than or equal to target. If there is no such subarray, return 0 instead.
         * 
         * Input: target = 7, nums = [2,3,1,2,4,3]
         * Output: 2
         * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
         * 
         * Input: target = 4, nums = [1,4,4]
         * Output: 1
         * 
         * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
         * Output: 0
         */
    }

    static int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            while (sum >= target) {
                ans = Math.min(ans, i - left + 1);
                sum -= nums[left++];
            }
        }
        
        return (ans != Integer.MAX_VALUE) ? ans : 0;
    }
}
