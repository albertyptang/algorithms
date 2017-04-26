package io.github.albertyptang.algorithms.interviewbit.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class ReverseStringTest {
    @Test
    public void reverseWords() throws Exception {
        assertEquals("the sky is blue", "blue is sky the", ReverseString.reverseWords("the sky is blue"));
        assertEquals("the sky is blue", "blue is sky the", ReverseString.reverseWords("   the sky is    blue  "));
    }
}