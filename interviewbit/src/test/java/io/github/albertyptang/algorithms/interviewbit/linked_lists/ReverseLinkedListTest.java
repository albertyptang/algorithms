package io.github.albertyptang.algorithms.interviewbit.linked_lists;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.linked_lists.domain.ListNode;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class ReverseLinkedListTest {
    @Test
    public void reverseList() throws Exception {
        final ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);

        final ListNode reversed = ReverseLinkedList.reverseList(list);
        assertEquals(5, reversed.val);
        assertEquals(4, reversed.next.val);
        assertEquals(3, reversed.next.next.val);
        assertEquals(2, reversed.next.next.next.val);
        assertEquals(1, reversed.next.next.next.next.val);
        assertNull(reversed.next.next.next.next.next);

        final ListNode singletonList = new ListNode(1);
        final ListNode reversedSingletonList = ReverseLinkedList.reverseList(singletonList);
        assertEquals(singletonList, reversedSingletonList);
    }

}