package io.github.albertyptang.algorithms.interviewbit.linked_lists;

import io.github.albertyptang.algorithms.interviewbit.linked_lists.domain.ListNode;

/**
 * Reverse a linked list. Do it in-place and in one-pass.
 * <p>
 * For example:
 * Given 1->2->3->4->5->NULL,
 * <p>
 * return 5->4->3->2->1->NULL.
 *
 * @author atang
 */
public class ReverseLinkedList {

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * public int val;
     * public ListNode next;
     * ListNode(int x) { val = x; next = null; }
     * }
     */
    public static ListNode reverseList(ListNode a) {

        if (a.next == null) {
            return a;
        }
        ListNode current = a;
        ListNode next = a.next;
        ListNode nextNext = a.next.next;
        current.next = null;
        while (true) {
            // 1 (current) | 2 (next) -> 3 (nextNext) -> 4 -> 5 -> NULL
            next.next = current;
            // 1 (current) <- 2 (next) | 3 (nextNext) -> 4 -> 5 -> NULL
            current = next;
            // 1 <- 2 (current, next) | 3 (nextNext) -> 4 -> 5 -> NULL
            next = nextNext;
            // 1 <- 2 (current) | 3 (next, nextNext) -> 4 -> 5 -> NULL
            if (next == null) {
                a = current;
                break;
            } else {
                nextNext = next.next;
            }
            // 1 <- 2 (current) | 3 (next) -> 4 (nextNext) -> 5 -> NULL
        }
        return a;
    }
}
