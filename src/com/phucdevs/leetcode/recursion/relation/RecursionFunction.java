package com.phucdevs.leetcode.recursion.relation;

public class RecursionFunction {

    public static void main(String[] args) {

        /**
         * Given a linked list, swap every two adjacent nodes and return its head.
         * You must solve the problem without modifying the values in the list's nodes
         * (i.e., only nodes themselves may be changed.)
         *
         * Input: head = [1,2,3,4]
         * Output: [2,1,4,3]
         *
         * Input: head = []
         * Output: []
         *
         * Input: head = [1]
         * Output: [1]
         */
    }

    static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode firstNode = head;
        ListNode secondNode = head.next;

        firstNode.next = swapPairs(secondNode.next);
        secondNode.next = firstNode;

        return secondNode;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
