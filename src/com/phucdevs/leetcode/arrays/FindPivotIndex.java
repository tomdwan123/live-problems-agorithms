package com.phucdevs.leetcode.arrays;

public class FindPivotIndex {
    

    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3};
        System.out.println(pivotIndexv1(nums));
    }

    static int pivotIndexv1(int[] nums) {
        
        int sumLeft = 0;
        int sumRight = 0;
        int left = 0;
        int right = nums.length - 1;
        
        while (left < nums.length && left <= right) {            
            sumRight += nums[right];
            right--;
            
            if (left == right || left == nums.length - 1) {
                
                if (left > 0) {
                    sumLeft += nums[left - 1];
                }
                
                if (left == nums.length - 1) {
                    return sumLeft == 0 ? left : -1;
                }
                
                if (sumLeft == sumRight) {
                    return left;
                }
                
                left++;
                right = nums.length - 1;
                sumRight = 0;
            }
        }
        
        return -1;    
    }

    static int pivotIndexv2(int[] nums) {

        int totalSum = 0;
        int leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; leftSum += nums[i++]) {
            if (2 * leftSum == (totalSum - nums[i])) {
                return i;
            }
        }

        return -1;
    }
}

