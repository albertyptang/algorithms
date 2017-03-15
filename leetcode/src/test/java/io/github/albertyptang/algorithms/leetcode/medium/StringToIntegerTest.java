package io.github.albertyptang.algorithms.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class StringToIntegerTest {

    @Test
    public void emptyStringTest() throws Exception {
        assertEquals(0, StringToInteger.atoi(""));
    }

    @Test
    public void whiteSpaceTest() throws Exception {
        assertEquals(0, StringToInteger.atoi("      "));
        assertEquals(1, StringToInteger.atoi(" \r \t \f \n 1"));
    }

    @Test
    public void negativeTest() throws Exception {
        assertEquals(0, StringToInteger.atoi("      -"));
        assertEquals(-1, StringToInteger.atoi(" -1"));
        assertEquals(1, StringToInteger.atoi(" +1"));
        assertEquals(0, StringToInteger.atoi("+"));
        assertEquals(0, StringToInteger.atoi("+"));
        assertEquals(-2147483648, StringToInteger.atoi("-2147483648"));
        assertEquals(0, StringToInteger.atoi("+-2"));
    }

    @Test
    public void digitTest() throws Exception {
        assertEquals(2147483647, StringToInteger.atoi("2147483647"));
        assertEquals(2147483647, StringToInteger.atoi("2147483648"));
        assertEquals(37, StringToInteger.atoi("37heythere"));
    }
}