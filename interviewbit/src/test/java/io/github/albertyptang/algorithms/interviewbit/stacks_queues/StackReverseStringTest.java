package io.github.albertyptang.algorithms.interviewbit.stacks_queues;

import org.junit.Test;

import static org.junit.Assert.*;

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