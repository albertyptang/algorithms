package io.github.albertyptang.algorithms.interviewbit.stacks_queues;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class RedundantBracesTest {
    @Test
    public void braces() throws Exception {
        assertEquals(1, RedundantBraces.braces("((a + b))"));
        assertEquals(0, RedundantBraces.braces("(a + (a + b))"));
        assertEquals(1, RedundantBraces.braces("(((a + a)) + b)"));
        assertEquals(1, RedundantBraces.braces("(a)"));
    }
}