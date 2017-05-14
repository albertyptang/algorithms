package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class LongestIncreasingSubsequenceTest {
    @Test
    public void lis() throws Exception {
        assertEquals(1, LongestIncreasingSubsequence.lis(Collections.singletonList(1)));
        assertEquals(6, LongestIncreasingSubsequence.lis(Arrays.asList(0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15)));
    }
}