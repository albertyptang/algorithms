package io.github.albertyptang.algorithms.interviewbit.hashing;

import org.junit.Test;

import static org.junit.Assert.*;

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