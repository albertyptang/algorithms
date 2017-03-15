package io.github.albertyptang.algorithms.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class ZigZagConversionTest {

    @Test
    public void convert() throws Exception {
        assertEquals("PAHNAPLSIIGYIR", ZigZagConversion.convert("PAYPALISHIRING",3));
        assertEquals("A", ZigZagConversion.convert("A",1));
        assertEquals("A", ZigZagConversion.convert("A",3));
    }
}