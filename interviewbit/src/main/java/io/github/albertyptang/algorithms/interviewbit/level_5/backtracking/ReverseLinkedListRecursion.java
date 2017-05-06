package io.github.albertyptang.algorithms.interviewbit.level_5.backtracking;

import io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain.ListNode;

/**
 * Reverse a linked list using recursion.
 * <p>
 * Example :
 * Given 1->2->3->4->5->NULL,
 * <p>
 * return 5->4->3->2->1->NULL.
 *
 * @author atang
 */
public class ReverseLinkedListRecursion {

    public static ListNode reverseList(final ListNode a) {
        return reverseListRecursion(a, null);
    }

    private static ListNode reverseListRecursion(final ListNode a, final ListNode reversed) {
        if (a == null) {
            return reversed;
        }
        final ListNode aNext = a.next;
        a.next = reversed;
        return reverseListRecursion(aNext, a);
    }
}
