package io.github.albertyptang.algorithms.interviewbit.stacks_queues;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class LargestRectangleInHistogramTest {
    @Test
    public void largestRectangleArea() throws Exception {
        assertEquals(10, LargestRectangleInHistogram.largestRectangleArea(new ArrayList<>(Arrays.asList(2, 1, 5, 6, 2, 3))));
        assertEquals(1, LargestRectangleInHistogram.largestRectangleArea(new ArrayList<>(Collections.singletonList(1))));
        assertEquals(418, LargestRectangleInHistogram.largestRectangleArea(new ArrayList<>(
            Arrays.asList(47, 69, 67, 97, 86, 34, 98, 16, 65, 95, 66, 69, 18, 1, 99, 56, 35, 9, 48, 72, 49, 47, 1, 72, 87, 52, 13, 23, 95, 55, 21, 92, 36, 88, 48, 39, 84, 16, 15, 65, 7, 58, 2, 21, 54, 2, 71, 92, 96, 100, 28, 31, 24, 10, 94, 5, 81, 80, 43, 35, 67, 33, 39, 81, 69, 12, 66, 87, 86, 11, 49, 94, 38, 44, 72, 44, 18, 97, 23, 11, 30, 72, 51, 61, 56, 41, 30, 71, 12, 44, 81, 43, 43, 27)
        )));
        assertEquals(342, LargestRectangleInHistogram.largestRectangleArea(new ArrayList<>(
            Arrays.asList(78, 65, 65, 2, 86, 20, 73, 95, 1, 67, 32, 26, 83, 67, 90, 16, 98, 60, 84, 56, 9, 1, 84, 16, 9, 9, 86, 47, 19, 80, 82, 58, 49, 27, 23, 70, 51, 53, 22, 65, 23, 90, 26, 40, 8, 48, 67, 64, 57, 86, 100, 17, 91, 83, 9, 30, 68, 77, 98, 1, 80, 36, 93, 20, 16, 7, 21, 88, 100, 84, 43, 57, 22, 60, 78, 11, 42, 73, 11, 90, 98, 83, 89, 23, 17, 35, 78, 76, 80, 39, 63, 93, 7, 72)
        )));
    }
}