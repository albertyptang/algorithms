package io.github.albertyptang.algorithms.interviewbit.arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class MaxDistanceTest {
    @Test
    public void maximumGap() throws Exception {
        assertEquals(2, MaxDistance.maximumGap(Arrays.asList(3, 5, 4, 2)));
        assertEquals(3, MaxDistance.maximumGap(Arrays.asList(3, 3, 3, 3)));
    }
}