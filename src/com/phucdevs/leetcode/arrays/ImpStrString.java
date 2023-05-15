package com.phucdevs.leetcode.arrays;

import java.util.*;

public class ImpStrString {

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";
        System.out.println(strStr(haystack, needle));
    }

    static int strStr(String haystack, String needle) {
        
        int h = haystack.length();
        int n = needle.length();
        
        if (h < n) {
            return -1;
        }
        
        List<Integer> occurs = new ArrayList<>();
        char firstChar = needle.charAt(0);
        
        for (int i = 0; i < h; i++) {
            if (haystack.charAt(i) == firstChar) {
                occurs.add(i);
            }
        }
        
        if (occurs.size() == 0) {
            return -1;
        }
        
        for (int occur : occurs) {
            int z = 0;
            int minLimit = Math.min(occur + n, h);
            for (int j = occur; j < minLimit; j++) {
                if (haystack.charAt(j) != needle.charAt(z)) {
                    break;
                }
                
                z++;
                if (z == n) {
                    return occur;
                }
            }
        }
        
        return -1;
    }
    
}
