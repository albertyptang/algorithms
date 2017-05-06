package io.github.albertyptang.algorithms.interviewbit.level_5.backtracking;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain.ListNode;
import io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain.ListNodeBuilder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author atang
 */
public class ReverseLinkedListRecursionTest {
    @Test
    public void reverseList() throws Exception {
        final ListNode list = ListNodeBuilder.build(1, 2, 3, 4, 5);
        final ListNode reversed = ReverseLinkedListRecursion.reverseList(list);
        assertEquals(5, reversed.val);
        assertEquals(4, reversed.next.val);
        assertEquals(3, reversed.next.next.val);
        assertEquals(2, reversed.next.next.next.val);
        assertEquals(1, reversed.next.next.next.next.val);
        assertNull(reversed.next.next.next.next.next);

        final ListNode singletonList = new ListNode(1);
        final ListNode reversedSingletonList = ReverseLinkedListRecursion.reverseList(singletonList);
        assertEquals(singletonList, reversedSingletonList);
    }

}