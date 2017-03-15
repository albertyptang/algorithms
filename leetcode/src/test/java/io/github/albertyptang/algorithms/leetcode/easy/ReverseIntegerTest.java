package io.github.albertyptang.algorithms.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class ReverseIntegerTest {

    @Test
    public void reverse() throws Exception {
        assertEquals(0, ReverseInteger.reverse(-2147483648));
        assertEquals(0, ReverseInteger.reverse(-2147483647));
        assertEquals(-463847412, ReverseInteger.reverse(-214748364));
        assertEquals(0, ReverseInteger.reverse(1534236469));
        assertEquals(-123, ReverseInteger.reverse(-321));
    }
}