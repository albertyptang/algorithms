package io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists;

import io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain.ListNode;

/**
 * Given a singly linked list
 * <p>
 * L: L0 → L1 → … → Ln-1 → Ln,
 * reorder it to:
 * <p>
 * L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
 * You must do this in-place without altering the nodes’ values.
 * <p>
 * For example,
 * Given {1,2,3,4}, reorder it to {1,4,2,3}.
 *
 * @author atang
 */
public class ReorderList {
    public static ListNode reorderList(ListNode a) {
        if (a == null || a.next == null) {
            return a;
        }
        int length = 0;
        ListNode ruler = a;
        while (ruler != null) {
            ruler = ruler.next;
            length++;
        }
        ListNode[] listNodeArray = new ListNode[length];

        ListNode arrayPointer = a;
        int index = 0;
        while (arrayPointer != null) {
            listNodeArray[index] = arrayPointer;
            arrayPointer = arrayPointer.next;
            index++;
        }

        index = 0;
        int reversedIndex = length - 1;
        ListNode reorderPointer = a;
        while (reorderPointer != null && index < reversedIndex) {
            final ListNode reorderPointerNext = reorderPointer.next;
            final ListNode endNode = listNodeArray[reversedIndex];
            reorderPointer.next = endNode;
            endNode.next = reorderPointerNext;
            reorderPointer = reorderPointerNext;
            reversedIndex--;
            index++;
        }
        reorderPointer.next = null;
        return a;
    }
}
