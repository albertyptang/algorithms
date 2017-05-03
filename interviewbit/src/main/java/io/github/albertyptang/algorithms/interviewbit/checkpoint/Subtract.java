package io.github.albertyptang.algorithms.interviewbit.checkpoint;

import io.github.albertyptang.algorithms.interviewbit.linked_lists.domain.ListNode;

/**
 * Given a singly linked list, modify the value of first half nodes such that :
 * <p>
 * 1st node’s new value = the last node’s value - first node’s current value
 * 2nd node’s new value = the second last node’s value - 2nd node’s current value,
 * and so on …
 * <p>
 * NOTE :
 * * If the length L of linked list is odd, then the first half implies at first floor(L/2) nodes. So, if L = 5, the first half refers to first 2 nodes.
 * * If the length L of linked list is even, then the first half implies at first L/2 nodes. So, if L = 4, the first half refers to first 2 nodes.
 * Example :
 * <p>
 * Given linked list 1 -> 2 -> 3 -> 4 -> 5,
 * <p>
 * You should return 4 -> 2 -> 3 -> 4 -> 5
 * as
 * <p>
 * for first node, 5 - 1 = 4
 * for second node, 4 - 2 = 2
 * Try to solve the problem using constant extra space.
 *
 * @author atang
 */
public class Subtract {
    /**
     * @see io.github.albertyptang.algorithms.interviewbit.linked_lists.ReverseLinkedList#reverseList(ListNode)
     * @param a list to reverse.
     * @return the modified list.
     */
    public static ListNode subtract(ListNode a) {

        if (a.next == null) {
            return a;
        }

        ListNode ruler = a;
        int length = 0;
        while (ruler != null) {
            length++;
            ruler = ruler.next;
        }
        int halfLength = length / 2;

        // reverse first half.
        ListNode reversed = a;
        ListNode next = a.next;
        ListNode nextNext = a.next.next;
        while (halfLength > 1) {
            halfLength--;
            // stop at halfLength == 1 to not reverse the first node of the right half.
            // start :   1 (reversed) -> 2 (next) -> 3 (nextNext) -> 4 -> 5 -> NULL
            // end :     1 <- 2 (reversed) | 3 (next) -> 4 (nextNext) -> 5 -> NULL
            next.next = reversed;
            reversed = next;
            next = nextNext;
            nextNext = next.next;
        }
        ListNode rightPointer = length % 2 == 0 ? next : next.next;
        ListNode rightStart = next;
        while (rightPointer != null) {
            reversed.val = rightPointer.val - reversed.val;
            // 1 <- 2 (reversed) | 3 -> 4 (rightStart, rightPointer) -> 5 -> NULL
            ListNode reversedNext = reversed.next;
            // 1 (reversedNext) <- 2 (reversed) | 3 (rightStart) -> 4 (rightPointer) -> 5 -> NULL
            reversed.next = rightStart;
            // 1 (reversedNext) | 2 (reversed) -> 3 (rightStart) -> 4 (rightPointer) -> 5 -> NULL
            rightStart = reversed;
            // 1 (reversedNext) | 2 (reversed, rightStart) -> 3 -> 4 (rightPointer) -> 5 -> NULL

            reversed = reversedNext;
            // 1 (reversed, reversedNext) | 2 (rightStart) -> 3 -> 4 (rightPointer) -> 5 -> NULL
            rightPointer = rightPointer.next;
            // 1 (reversed, reversedNext) | 2 (rightStart) -> 3 -> 4 -> 5 (rightPointer) -> NULL
        }
        return a;
    }
}
