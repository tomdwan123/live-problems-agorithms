package com.phucdevs.leetcode.solvefirstproblem;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfTheLinkedListProblem {

    public static void main(String[] args) {

        /**
         * Given the head of a singly linked list, return the middle node of the linked list.
         *
         * If there are two middle nodes, return the second middle node.
         *
         * Input: head = [1,2,3,4,5]
         * Output: [3,4,5]
         * Explanation: The middle node of the list is node 3.
         *
         * Input: head = [1,2,3,4,5,6]
         * Output: [4,5,6]
         * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
         */
    }

    public ListNode middleNode(ListNode head) {

        List<ListNode> result = new ArrayList<>();

        while (head != null) {
            result.add(head);
            head = head.next;
        }

        // Time complexity: O(n)
        // Space complexity: O(n)

        return result.get(result.size() / 2);
    }

    public ListNode middleNodeAdvanced(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Time complexity: O(n)
        // Space complexity: O(1)

        return slow;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
