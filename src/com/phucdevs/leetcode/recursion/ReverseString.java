package com.phucdevs.leetcode.recursion;

public class ReverseString {

    public static void main(String[] args) {

        printReverseString("abcde".toCharArray());
    }

    private static void printReverseString(char[] str) {
        helper(0, str);
    }

    private static void helper(int index, char[] str) {
        if (str == null || index >= str.length) {
            return;
        }

        helper(index + 1, str);
        System.out.print(str[index]);
    }
}
