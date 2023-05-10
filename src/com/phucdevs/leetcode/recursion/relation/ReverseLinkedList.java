package com.phucdevs.leetcode.recursion.relation;

public class ReverseLinkedList {

    public static void main(String[] args) {

        /**
         * Given the head of a singly linked list, reverse the list, and return the reversed list.
         *
         * Input: head = [1,2,3,4,5]
         * Output: [5,4,3,2,1]
         *
         * Input: head = [1,2]
         * Output: [2,1]
         *
         * Input: head = []
         * Output: []
         */
    }

    public ListNode reverseList(ListNode head) {

        ListNode previousNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        // Time complexity: O(n)
        // Space complexity: O(1)

        return previousNode;
    }

    public ListNode reverseList2(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode reversedList = reverseList2(head.next);
        head.next.next = head;
        head.next = null;

        // Time complexity: O(n)
        // Space complexity: O(n)

        return reversedList;
    }
}
