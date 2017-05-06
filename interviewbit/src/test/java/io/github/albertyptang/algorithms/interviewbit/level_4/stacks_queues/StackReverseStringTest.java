package io.github.albertyptang.algorithms.interviewbit.level_4.stacks_queues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class StackReverseStringTest {
    @Test
    public void reverseString() throws Exception {
        assertEquals("cba", StackReverseString.reverseString("abc"));
        assertEquals("", StackReverseString.reverseString(""));
    }

}