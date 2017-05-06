package io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists;

import io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain.ListNode;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * <p>
 * For example, the following two linked lists:
 * <p>
 * <p>
 * A:          a1 → a2
 * ↘
 * c1 → c2 → c3
 * ↗
 * B:     b1 → b2 → b3
 * <p>
 * begin to intersect at node c1.
 * <p>
 * Notes:
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 *
 * @author atang
 */
public class IntersectionOfLinkedLists {

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * public int val;
     * public ListNode next;
     * ListNode(int x) { val = x; next = null; }
     * }
     */
    public static ListNode getIntersectionNode(ListNode a, ListNode b) {
        int aLength = 0;
        int bLength = 0;
        ListNode aNode = a;
        ListNode bNode = b;
        while (aNode != null) {
            aLength++;
            aNode = aNode.next;
        }
        while (bNode != null) {
            bLength++;
            bNode = bNode.next;
        }

        ListNode aNodeStart = a;
        ListNode bNodeStart = b;
        while (bLength > aLength) {
            bLength--;
            bNodeStart = bNodeStart.next;
        }
        while (aLength > bLength) {
            aLength--;
            aNodeStart = aNodeStart.next;
        }
        while (aNodeStart != null) {
            if (aNodeStart == bNodeStart) {
                return aNodeStart;
            }
            aNodeStart = aNodeStart.next;
            bNodeStart = bNodeStart.next;
        }
        return null;
    }
}
