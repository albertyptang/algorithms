package io.github.albertyptang.algorithms.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class AddTwoNumbersTest {

    // input    (2 -> 4 -> 3) + (5 -> 6 -> 4)
    // output   (7 -> 0 -> 8)
    @Test
    public void addTwoNumbers() throws Exception {
        final AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2);
        l1.next = new AddTwoNumbers.ListNode(4);
        l1.next.next = new AddTwoNumbers.ListNode(3);

        final AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);
        l2.next = new AddTwoNumbers.ListNode(6);
        l2.next.next = new AddTwoNumbers.ListNode(4);

        final AddTwoNumbers.ListNode solution = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(7, solution.val);
        assertEquals(0, solution.next.val);
        assertEquals(8, solution.next.next.val);
        assertEquals(null, solution.next.next.next);
    }

}
