package io.github.albertyptang.algorithms.interviewbit.level_4;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain.ListNode;
import io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain.ListNodeBuilder;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class SubtractTest {
    @Test
    public void subtract() throws Exception {
        ListNode a = Subtract.subtract(ListNodeBuilder.build(1, 2, 3, 4, 5));
        assertEquals(4, a.val);
        assertEquals(2, a.next.val);
        assertEquals(3, a.next.next.val);
        assertEquals(4, a.next.next.next.val);
        assertEquals(5, a.next.next.next.next.val);
        assertEquals(null, a.next.next.next.next.next);

        ListNode b = Subtract.subtract(ListNodeBuilder.build(1, 2, 3, 4));
        assertEquals(3, b.val);
        assertEquals(1, b.next.val);
        assertEquals(3, b.next.next.val);
        assertEquals(4, b.next.next.next.val);
        assertEquals(null, b.next.next.next.next);

        ListNode c = Subtract.subtract(ListNodeBuilder.build(1, 2, 3));
        assertEquals(2, c.val);
        assertEquals(2, c.next.val);
        assertEquals(3, c.next.next.val);
        assertEquals(null, c.next.next.next);

        ListNode d = Subtract.subtract(ListNodeBuilder.build(2, 2));
        assertEquals(0, d.val);
        assertEquals(2, d.next.val);
        assertEquals(null, d.next.next);
    }
}