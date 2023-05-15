package com.phucdevs.leetcode.arrays;

public class AddBinary {
    
    public static void main(String[] args) {
        
        /**
         * Given two binary strings a and b, return their sum as a binary string.
         * 
         * Input: a = "11", b = "1"
         * Output: "100"
         * 
         * Input: a = "1010", b = "1011"
         * Output: "10101"
         */
    }

    static String addBinary(String a, String b) {
        
        int n = a.length();
        int m = b.length();
        int distance = n - m;

        if (n < m) {
            return addBinary(b, a);
        }

        char remember = '0';
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            char aValue = a.charAt(i);
            char bValue = i < distance ? '0' : b.charAt(i - distance);
            if (aValue == '1' && bValue == '1') {
                if (remember == '1') {
                    sb.append("1");
                    remember = '1';
                } else {
                    sb.append("0");
                    remember = '1';
                }
            } else if (aValue == '1' && bValue == '0') {
                if (remember == '1') {
                    sb.append("0");
                    remember = '1';
                } else {
                    sb.append("1");
                    remember = '0';
                }
            } else if (aValue == '0' && bValue == '1') {
                if (remember == '1') {
                    sb.append("0");
                    remember = '1';
                } else {
                    sb.append("1");
                    remember = '0';
                }
            } else {
                if (remember == '1') {
                    sb.append("1");
                    remember = '0';
                } else {
                    sb.append("0");
                    remember = '0';
                }
            }
        }

        if (remember == '1') {
            sb.append("1");
        }

        sb.reverse();
        return sb.toString();
        
    }
}
