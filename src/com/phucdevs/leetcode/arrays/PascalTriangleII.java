package com.phucdevs.leetcode.arrays;

import java.util.*;;

public class PascalTriangleII {

    public static void main(String[] args) {
        
    }

    static List<Integer> getRow(int n) { 

        List<Integer> ans = new ArrayList<>();
        ans.add(1);

        long temp = 1;
        for (int i = 1, down = 1, up = n; i <= n; i++, down++, up--) {
            temp = temp * up / down;
            ans.add((int) temp);
        }

        return ans;
    }
}
