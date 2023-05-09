package com.phucdevs.leetcode.solvefirstproblem;public class SumOneArrayProblem {

    public static void main(String[] args) {

        /**
         * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
         *
         * Return the running sum of nums.
         * Example 1:
         * Input: nums = [1,2,3,4]
         * Output: [1,3,6,10]
         * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
         */
        int[] nums = {1,2,3,4};
        runningSum(nums);
    }

    static int[] runningSum(int[] nums) {

        int[] sumNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sumNums[i] = sumSubArray(i, nums);
        }

        return sumNums;
    }

    static int sumSubArray(int endIndex, int[] nums) {
        int sum = 0;
        for (int i = 0; i <= endIndex; i++) {
            sum += nums[i];
        }

        return sum;
    }

    static int[] runningSumAdvanced(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        // running complexity: O(N)
        // space complexity: O(1)

        return nums;
    }
}
