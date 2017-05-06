package io.github.albertyptang.algorithms.interviewbit.level_4.stacks_queues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class GenerateAllParenthesesTest {
    @Test
    public void isValid() throws Exception {
        assertEquals(1, GenerateAllParentheses.isValid("()"));
        assertEquals(1, GenerateAllParentheses.isValid("()[]{}"));
        assertEquals(0, GenerateAllParentheses.isValid("(]"));
        assertEquals(0, GenerateAllParentheses.isValid("([)]"));
    }

}