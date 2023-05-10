package com.phucdevs.leetcode.recursion.relation;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

    public static void main(String[] args) {

        /**
         * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
         *
         * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
         *
         * Input: rowIndex = 3
         * Output: [1,3,3,1]
         *
         * Input: rowIndex = 0
         * Output: [1]
         *
         * Input: rowIndex = 1
         * Output: [1,1]
         */
    }

    static List<Integer> getRow(int indexRow) {

        List<Integer> ans = new ArrayList<>();
        for (int col = 0; col <= indexRow; col++) {
            ans.add(getNum(indexRow, col));
        }

        return ans;
    }

    private static int getNum(int row, int col) {

        if (row == 0 || col == 0 || row == col) {
            return 1;
        }

        return getNum(row - 1, col - 1) + getNum(row - 1, col);
    }

    static List<Integer> getRowAdvanced(int n) {

        List<Integer> ans = new ArrayList<>();
        ans.add(1);

        long temp = 1;
        for (int r = 1, up = n, down = 1; r <= n; r++, up--, down++) {
            temp = temp * up / down;
            ans.add((int) temp);
        }

        return ans;
    }
}
