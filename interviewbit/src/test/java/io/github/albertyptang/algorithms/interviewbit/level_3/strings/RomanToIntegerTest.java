package io.github.albertyptang.algorithms.interviewbit.level_3.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class RomanToIntegerTest {
    @Test
    public void romanToInt() throws Exception {
        assertEquals("I", 1, RomanToInteger.romanToInt("I"));
        assertEquals("XIV", 14, RomanToInteger.romanToInt("XIV"));
        assertEquals("MCMLIV", 1954, RomanToInteger.romanToInt("MCMLIV"));
        assertEquals("MMXIV", 2014, RomanToInteger.romanToInt("MMXIV"));
    }
}