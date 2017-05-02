package io.github.albertyptang.algorithms.interviewbit.linked_lists;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.linked_lists.domain.ListNode;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class IntersectionOfLinkedListsTest {
    @Test
    public void getIntersectionNode() throws Exception {
        final ListNode c = new ListNode(8);
        c.next = new ListNode(9);
        c.next.next = new ListNode(7);

        final ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = c;

        final ListNode b = new ListNode(3);
        b.next = new ListNode(4);
        b.next.next = new ListNode(5);
        b.next.next.next = c;

        assertEquals(c, IntersectionOfLinkedLists.getIntersectionNode(a, b));
        assertEquals(null, IntersectionOfLinkedLists.getIntersectionNode(null, null));
    }
}