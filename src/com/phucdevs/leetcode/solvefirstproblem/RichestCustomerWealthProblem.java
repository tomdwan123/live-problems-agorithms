package com.phucdevs.leetcode.solvefirstproblem;

public class RichestCustomerWealthProblem {

    public static void main(String[] args) {

        /**
         * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
         * i​​​​​​​​​​​th​​​​ customer has in the
         * j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
         *
         * A customer's wealth is the amount of money they have in all their bank accounts. The richest customer
         * is the customer that has the maximum wealth.
         * Input: accounts = [[1,2,3],[3,2,1]]
         * Output: 6
         * Explanation:
         * 1st customer has wealth = 1 + 2 + 3 = 6
         * 2nd customer has wealth = 3 + 2 + 1 = 6
         * Both customers are considered the richest with a wealth of 6 each, so return 6.
         */

        int[][] account =  {{1,2,3},{3,2,1}};
        maximumWealth(account);
    }

    static int maximumWealth(int[][] accounts) {

        int maxWealth = 0;
        for (int[] customer : accounts) {
            int sumBanksCustomer = 0;

            for (int bank : customer) {
                sumBanksCustomer += bank;
            }

            maxWealth = Math.max(maxWealth, sumBanksCustomer);
        }

        // Time complexity: O(n x m)
        // Space complexity: O(1)

        return maxWealth;
    }
}
