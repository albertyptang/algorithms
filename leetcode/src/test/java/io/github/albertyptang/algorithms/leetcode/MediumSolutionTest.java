package io.github.albertyptang.algorithms.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class MediumSolutionTest {

    // input    (2 -> 4 -> 3) + (5 -> 6 -> 4)
    // output   (7 -> 0 -> 8)
    @Test
    public void addTwoNumbers() throws Exception {
        final MediumSolution.ListNode l1 = new MediumSolution.ListNode(2);
        l1.next = new MediumSolution.ListNode(4);
        l1.next.next = new MediumSolution.ListNode(3);

        final MediumSolution.ListNode l2 = new MediumSolution.ListNode(5);
        l2.next = new MediumSolution.ListNode(6);
        l2.next.next = new MediumSolution.ListNode(4);

        final MediumSolution.ListNode solution = new MediumSolution().addTwoNumbers(l1, l2);
        assertEquals(7, solution.val);
        assertEquals(0, solution.next.val);
        assertEquals(8, solution.next.next.val);
        assertEquals(null, solution.next.next.next);
    }

}
