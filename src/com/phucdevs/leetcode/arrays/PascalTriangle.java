package com.phucdevs.leetcode.arrays;

import java.util.*;

public class PascalTriangle {

    public static void main(String[] args) {
        
        System.out.println(generatev1(1));
        System.out.println(generatev1(2));
        System.out.println(generatev1(3));
        System.out.println(generatev1(4));
        System.out.println(generatev1(5));
        System.out.println(generatev1(30));
        System.out.println(generatev2(30));
    }

    static List<List<Integer>> generatev1(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();

        for (int row = 1; row<= numRows; row++) {
            result.add(generateRow(row));
        }

        return result;
    }

    static List<Integer> generateRow(int indexRow) {

        List<Integer> result = new ArrayList<>();

        for (int cell = 1; cell <= indexRow; cell++) {
            result.add(calCell(indexRow, cell));
        }

        return result;
    }

    static int calCell(int indexRow, int indexCell) {

        if (indexCell == 1 || indexCell == indexRow) {
            return 1;
        }

        return calCell(indexRow - 1, indexCell - 1) + calCell(indexRow - 1, indexCell);
    }

    static List<List<Integer>> generatev2(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        result.add(pre);

        for (int i = 2; i <= numRows; i++) {
            List<Integer> cursor = new ArrayList<>();

            // add first
            cursor.add(1);

            // add middle
            for (int j = 0; j < pre.size() - 1; j++) {
                cursor.add(pre.get(j) + pre.get(j + 1));
            }

            // add last
            cursor.add(1);

            pre = cursor;
            result.add(cursor);
        }

        return result;
    }
    
}
