package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class StairsTest {
    @Test
    public void climbStairs() throws Exception {
        assertEquals(1, Stairs.climbStairs(0));
        assertEquals(1, Stairs.climbStairs(1));
        assertEquals(2, Stairs.climbStairs(2));
        assertEquals(3, Stairs.climbStairs(3));
    }
}