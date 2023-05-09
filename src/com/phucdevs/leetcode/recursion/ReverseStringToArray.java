package com.phucdevs.leetcode.recursion;

public class ReverseStringToArray {

    public static void main(String[] args) {
    }

    static void reverseString(char[] s) {

        helper(0, s.length - 1, s);
    }

    private static void helper(int start, int end, char[] s) {

        if (start >= end) {
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        helper(start + 1, end - 1, s);
    }
}
