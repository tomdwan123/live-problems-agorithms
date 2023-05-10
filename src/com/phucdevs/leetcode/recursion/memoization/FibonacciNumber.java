package com.phucdevs.leetcode.recursion.memoization;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {

    public static void main(String[] args) {

    }

    static int fib(int n) {

        Map<Integer, Integer> caches = new HashMap();
        return fib(n, caches);
    }

    static int fib(int n, Map<Integer, Integer> caches) {

        if (caches.containsKey(n)) {
            return caches.get(n);
        }

        int result = (n < 2) ? n : fib(n - 1, caches) + fib(n - 2, caches);
        caches.put(n, result);
        return result;
    }
}
