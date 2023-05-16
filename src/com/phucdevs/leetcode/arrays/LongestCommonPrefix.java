package com.phucdevs.leetcode.arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        /**
         * Write a function to find the longest common prefix string amongst an array of strings.
         * If there is no common prefix, return an empty string "".
         *
         * Input: strs = ["flower","flow","flight"]
         * Output: "fl"
         * 
         * Input: strs = ["dog","racecar","car"]
         * Output: ""
         * Explanation: There is no common prefix among the input strings.
         */
        
    }

    static String longestCommonPrefixv1(String[] strs) {
        
        int defaultLength = strs[0].length();
        StringBuilder sb = new StringBuilder();
        boolean isBreakChild = false;


        for (int i = 0; i < defaultLength; i++) {
            char firstCharacter = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if (strs[j].length() < (i + 1) || strs[j].charAt(i) != firstCharacter) {
                    isBreakChild = true;
                    break;
                }
            }

            if (isBreakChild) {
                break;
            }
            
            sb.append(firstCharacter);
        }

        

        return sb.toString();
    }

    static String longestCommonPrefixv2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);             
            }
        }
        return strs[0];
    }
}
