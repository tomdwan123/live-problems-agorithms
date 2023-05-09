package com.phucdevs.leetcode.solvefirstproblem;

import java.util.HashMap;
import java.util.Map;

public class RansomNoteProblem {

    public static void main(String[] args) {

        /**
         * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by
         * using the letters from magazine and false otherwise.
         *
         * Each letter in magazine can only be used once in ransomNote.
         *
         * Input: ransomNote = "a", magazine = "b"
         * Output: false
         *
         * Input: ransomNote = "aa", magazine = "ab"
         * Output: false
         *
         * Input: ransomNote = "aa", magazine = "aab"
         * Output: true
         */
        canConstruct("a", "b");
        canConstruct("aa", "ab");
        canConstruct("aa", "aab");
    }

    static boolean canConstruct(String ransomNote, String magazine) {

        for (int i = 0; i < ransomNote.toCharArray().length; i++) {
            int indexStart = magazine.indexOf(ransomNote.charAt(i));

            if (indexStart == -1) {
                return false;
            }

            magazine = magazine.substring(0, indexStart) + magazine.substring(indexStart + 1);
        }

        // Time complexity: O(m + n)
        // Space complexity: O(n)

        return true;
    }

    static boolean canConstructAdvanced(String ransomNote, String magazine) {

        Map<Character, Integer> magazineLetters = new HashMap<>(); // k = 25

        for (int i = 0; i < magazine.toCharArray().length; i++) { // O(n)
            char m = magazine.charAt(i);

            int currentCount = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m, currentCount + 1);
        }

        for (int j = 0 ; j < ransomNote.toCharArray().length; j++) { // O(m)
            char r = ransomNote.charAt(j);

            int currentCount = magazineLetters.getOrDefault(r, 0);
            if (currentCount == 0) {
                return false;
            }
            magazineLetters.put(r, currentCount - 1);
        }

        // Time complexity: O(n)
        // Space complexity: O(k) -> O(1)

        return true;
    }
}
