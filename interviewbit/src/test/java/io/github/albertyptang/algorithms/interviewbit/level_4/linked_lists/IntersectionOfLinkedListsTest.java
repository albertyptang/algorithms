package io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain.ListNode;
import io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain.ListNodeBuilder;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class IntersectionOfLinkedListsTest {
    @Test
    public void getIntersectionNode() throws Exception {
        final ListNode c = ListNodeBuilder.build(8, 9, 7);

        final ListNode a = ListNodeBuilder.build(1, 2);
        a.next.next = c;

        final ListNode b = ListNodeBuilder.build(3, 4, 5);
        b.next.next.next = c;

        assertEquals(c, IntersectionOfLinkedLists.getIntersectionNode(a, b));
        assertEquals(null, IntersectionOfLinkedLists.getIntersectionNode(null, null));
    }
}