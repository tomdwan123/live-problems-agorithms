package com.phucdevs.leetcode.solvefirstproblem;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzProblem {

    public static void main(String[] args) {

        /**
         * Given an integer n, return a string array answer (1-indexed) where:
         *
         * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
         * answer[i] == "Fizz" if i is divisible by 3.
         * answer[i] == "Buzz" if i is divisible by 5.
         * answer[i] == i (as a string) if none of the above conditions are true.
         * Input: n = 3
         * Output: ["1","2","Fizz"]
         *
         * Input: n = 5
         * Output: ["1","2","Fizz","4","Buzz"]
         *
         * Input: n = 15
         * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
         */
        fizzBuzz(3);
        fizzBuzz(5);
        fizzBuzz(15);
    }

    static List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                answer.add("FizzBuzz");
            } else if (divisibleBy3) {
                answer.add("Fizz");
            } else if (divisibleBy5) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}
