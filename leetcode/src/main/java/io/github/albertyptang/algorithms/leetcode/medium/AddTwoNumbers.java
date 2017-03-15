package io.github.albertyptang.algorithms.leetcode.medium;

/**
 * 2. Add Two Numbers
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * @author atang
 */
public class AddTwoNumbers {

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(final ListNode l1, final ListNode l2) {
        ListNode l1Pointer = l1;
        ListNode l2Pointer = l2;
        ListNode sumList = null;
        ListNode sumListPointer = null;
        boolean carryOver = false;

        while (l1Pointer != null || l2Pointer != null) { // while both have nodes to iterate through
            int sum = carryOver ? 1 : 0; // if there is a carry over from previous digit sum, increase the sum by 1.
            if (l1Pointer != null) { // l1 still has nodes
                sum += l1Pointer.val;
                l1Pointer = l1Pointer.next;
            }
            if (l2Pointer != null) { // l2 still has nodes
                sum += l2Pointer.val;
                l2Pointer = l2Pointer.next;
            }
            carryOver = sum >= 10; // carry over in the next sum.
            final ListNode newNode = new ListNode(sum % 10);
            if (sumList == null) { // handle case when sum list is not yet created.
                sumList = newNode; // mark the head of the sum list.
            } else {
                sumListPointer.next = newNode;
            }
            sumListPointer = newNode; // move to the latest sum list node.
        }
        if (carryOver) { // if there are no more nodes to add, but still carry over remaining.
            sumListPointer.next = new ListNode(1);
        }
        return sumList;
    }
}
