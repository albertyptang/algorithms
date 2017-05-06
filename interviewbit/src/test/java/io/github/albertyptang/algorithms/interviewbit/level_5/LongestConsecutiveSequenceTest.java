package io.github.albertyptang.algorithms.interviewbit.level_5;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class LongestConsecutiveSequenceTest {
    @Test
    public void longestConsecutive() throws Exception {
        assertEquals(6, LongestConsecutiveSequence.longestConsecutive(Arrays.asList(80, 100, 101, 5, 0, 4, 1, 3, 2)));
    }
}