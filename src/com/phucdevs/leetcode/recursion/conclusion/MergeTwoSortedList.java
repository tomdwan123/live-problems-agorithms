package com.phucdevs.leetcode.recursion.conclusion;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        
        /**
         * You are given the heads of two sorted linked lists list1 and list2.
         * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
         * Return the head of the merged linked list.
         * 
         * Input: list1 = [1,2,4], list2 = [1,3,4]
         * Output: [1,1,2,3,4,4]
         * 
         * Input: list1 = [], list2 = []
         * Output: []
         * 
         * Input: list1 = [], list2 = [0]
         * Output: [0]
         */


    } 

    static ListNode mergeTwoListsv1(ListNode list1, ListNode list2) {
        
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoListsv1(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsv1(list1, list2.next);
            return list2;
        }
        
        // Time complexity: O(n + m)
        // Space complexity: O(n + m)
    }

    static ListNode mergeTwoListsv2(ListNode list1, ListNode list2) {

        ListNode preHead = new ListNode(-1);
        ListNode preNode = preHead;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                preNode.next = list1;
                list1 = list1.next;
            } else {
                preNode.next = list2;
                list2 = list2.next;
            }

            preNode = preNode.next;
        }

        preNode.next = list1 == null ? list2 : list1;
        return preHead.next;

        // Time complexity: O(n + m)
        // Space complexity: O(1)

        return list2;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
