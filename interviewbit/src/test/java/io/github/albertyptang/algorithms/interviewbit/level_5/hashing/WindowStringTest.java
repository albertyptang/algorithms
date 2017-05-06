package io.github.albertyptang.algorithms.interviewbit.level_5.hashing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class WindowStringTest {
    @Test
    public void minWindow() throws Exception {
        assertEquals("BANCOC", WindowString.minWindow("ADOBECODEBANCOC", "CABC"));
        assertEquals("", WindowString.minWindow("ADOBECODEBANC", ""));
        assertEquals("", WindowString.minWindow("A", "C"));
        assertEquals("C", WindowString.minWindow("C", "C"));
    }
}