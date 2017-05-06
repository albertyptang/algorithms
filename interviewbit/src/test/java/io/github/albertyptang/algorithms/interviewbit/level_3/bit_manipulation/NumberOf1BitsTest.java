package io.github.albertyptang.algorithms.interviewbit.level_3.bit_manipulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class NumberOf1BitsTest {
    @Test
    public void numSetBits() throws Exception {
        assertEquals(3, NumberOf1Bits.numSetBits(11));
        assertEquals(1, NumberOf1Bits.numSetBits(2));
        assertEquals(1, NumberOf1Bits.numSetBits(1));
        assertEquals(0, NumberOf1Bits.numSetBits(0));
    }
}