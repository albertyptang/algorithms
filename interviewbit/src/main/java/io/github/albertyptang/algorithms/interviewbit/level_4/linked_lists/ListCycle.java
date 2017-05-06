package io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists;

import io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain.ListNode;

/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * <p>
 * Try solving it using constant additional space.
 * <p>
 * Example :
 * <p>
 * Input :
 *
 *            ____
 *           |    |
 *           \/   |
 * 1 -> 2 -> 3 -> 4
 * <p>
 * Return the node corresponding to node 3.
 *
 * @author atang
 */
public class ListCycle {
    public static ListNode detectCycle(final ListNode a) {
        ListNode pointer = a;
        ListNode fastPointer = a;
        while (true) {
            if (fastPointer == null || fastPointer.next == null) {
                return null;
            }
            fastPointer = fastPointer.next.next;
            pointer = pointer.next;
            if (pointer != null && pointer == fastPointer) {
                break;
            }
        }
        // the theory:
        // x is the distance before the cycle.
        // y is the distance of the cycle until the first meeting point.
        // z is the rest of the distance of the cycle.
        //
        // thus because fastPointer moves twice the distance of pointer
        // 2 * (x + y) = x + y + z + y
        // 2x + 2y = x + z + 2y
        // x = z
        //
        // thus the point where the cycle starts is where
        // a pointer starting at the beginning
        // and a pointer starting at the x + y
        // meet again, having traveled x = z steps.

        pointer = a;
        while (true) {
            if (pointer == fastPointer) {
                return pointer;
            }
            fastPointer = fastPointer.next;
            pointer = pointer.next;
        }
    }
}
