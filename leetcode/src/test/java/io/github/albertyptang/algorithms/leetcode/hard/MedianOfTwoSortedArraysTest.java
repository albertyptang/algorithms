package io.github.albertyptang.algorithms.leetcode.hard;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class MedianOfTwoSortedArraysTest {

    @Test
    public void medianOfTwoSortedArrays() throws Exception {
        final double solution1 = MedianOfTwoSortedArrays.getMedian(new int[]{1,3}, new int[]{2});
        assertEquals(2.0, solution1, 0.1);

        final double solution2 = MedianOfTwoSortedArrays.getMedian(new int[]{1,2}, new int[]{3,4});
        assertEquals(2.5, solution2, 0.1);

        final double solution3 = MedianOfTwoSortedArrays.getMedian(new int[]{3,6,8}, new int[]{1,2,4,5,7,9,10});
        assertEquals(5.5, solution3, 0.1);
    }
}
