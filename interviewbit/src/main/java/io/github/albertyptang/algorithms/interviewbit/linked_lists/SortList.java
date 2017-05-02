package io.github.albertyptang.algorithms.interviewbit.linked_lists;

import io.github.albertyptang.algorithms.interviewbit.linked_lists.domain.ListNode;

/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 *
 * Example :
 *
 * Input : 1 -> 5 -> 4 -> 3
 *
 * Returned list : 1 -> 3 -> 4 -> 5
 *
 * @author atang
 */
public class SortList {

    public static ListNode sortList(ListNode a) {
        if (a == null || a.next == null) {
            return a;
        }

        int length = 0;
        ListNode ruler = a;
        while (ruler != null) {
            ruler = ruler.next;
            length++;
        }
        int middle = length / 2;

        ListNode left = a;
        ListNode right = null;
        ListNode pointer = a;
        int countHalf = 0;
        while (pointer != null) {
            countHalf++;
            ListNode next = pointer.next;

            if (countHalf == middle) {
                pointer.next = null; // end left.
                right = next; // the remaining list is right.
            }
            pointer = next;
        }

        ListNode sortedLeft = sortList(left);
        ListNode sortedRight = sortList(right);

        return mergeSort(sortedLeft, sortedRight);
    }

    private static ListNode mergeSort(final ListNode left, final ListNode right) {
        ListNode leftPointer = left;
        ListNode rightPointer = right;

        // starting point since we don't know the actual first (least) node in the merged result.
        // start.next will be that first (least) node.
        ListNode start = new ListNode(0);
        ListNode mergedPointer = start;

        while (leftPointer != null || rightPointer != null) {

            if (leftPointer == null) {
                // account for remaining right entries when left is finished.
                mergedPointer.next = new ListNode(rightPointer.val);
                rightPointer = rightPointer.next;
                mergedPointer = mergedPointer.next;
            } else if (rightPointer == null) {
                // account for remaining left entries when right is finished.
                mergedPointer.next = new ListNode(leftPointer.val);
                leftPointer = leftPointer.next;
                mergedPointer = mergedPointer.next;
            } else {
                // sort based on value.
                if (leftPointer.val < rightPointer.val) {
                    mergedPointer.next = new ListNode(leftPointer.val);
                    leftPointer = leftPointer.next;
                    mergedPointer = mergedPointer.next;
                } else {
                    mergedPointer.next = new ListNode(rightPointer.val);
                    rightPointer = rightPointer.next;
                    mergedPointer = mergedPointer.next;
                }
            }
        }
        return start.next;
    }
}
