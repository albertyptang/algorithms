package io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain;

/**
 * @author atang
 */
public class ListNodeBuilder {

    public static ListNode build(final int... array) {
        if (array.length < 1) {
            return null;
        }
        final ListNode list = new ListNode(array[0]);
        ListNode pointer = list;
        for (int i = 1; i < array.length; i++) {
            pointer.next = new ListNode(array[i]);
            pointer = pointer.next;
        }
        return list;
    }
}
