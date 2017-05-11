package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class WaysToDecodeTest {
    @Test
    public void numDecodings() throws Exception {
        assertEquals(1, WaysToDecode.numDecodings("1"));
        assertEquals(2, WaysToDecode.numDecodings("12"));
        assertEquals(3, WaysToDecode.numDecodings("123"));

        assertEquals(0, WaysToDecode.numDecodings("0"));
        assertEquals(1, WaysToDecode.numDecodings("10"));
        assertEquals(0, WaysToDecode.numDecodings("010"));
    }
}