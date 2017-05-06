package io.github.albertyptang.algorithms.interviewbit.level_2.arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class MinStepsInInfiniteGridTest {
    @Test
    public void coverPoints() throws Exception {
        assertEquals(2, MinStepsInInfiniteGrid.coverPoints(
            Arrays.asList(0, 1, 1),
            Arrays.asList(0, 1, 2)
        ));
        assertEquals(7, MinStepsInInfiniteGrid.coverPoints(
            Arrays.asList(0, 7),
            Arrays.asList(0, 7)
        ));
        assertEquals(2, MinStepsInInfiniteGrid.coverPoints(
            Arrays.asList(0, 1, 1),
            Arrays.asList(0, 1, 2)
        ));
        assertEquals(8, MinStepsInInfiniteGrid.coverPoints(
            Arrays.asList(0, 6, 7),
            Arrays.asList(0, 7, 7)
        ));
    }
}