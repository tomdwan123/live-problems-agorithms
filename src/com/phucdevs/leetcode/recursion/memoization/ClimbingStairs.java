package com.phucdevs.leetcode.recursion.memoization;

public class ClimbingStairs {

    public static void main(String[] args) {

        /**
         * You are climbing a staircase. It takes n steps to reach the top.
         *
         * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
         *
         * Input: n = 2
         * Output: 2
         * Explanation: There are two ways to climb to the top.
         * 1. 1 step + 1 step
         * 2. 2 steps
         *
         * Input: n = 3
         * Output: 3
         * Explanation: There are three ways to climb to the top.
         * 1. 1 step + 1 step + 1 step
         * 2. 1 step + 2 steps
         * 3. 2 steps + 1 step
         */
    }

    public int climbStairs(int n) {
        return climb_Stairs(0, n);
    }
    public int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }

    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length ;
        for(int i=2 ; i<n ; i++){
            cost[i] = Math.min(cost[i-1] , cost[i-2]) + cost[i];
        }
        return Math.min(cost[n-1] , cost[n-2]);
    }
}
