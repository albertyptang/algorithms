package io.github.albertyptang.algorithms.interviewbit.level_2.math;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class PrimeSumTest {
    @Test
    public void primesum() throws Exception {
        assertEquals(Arrays.asList(2, 2), PrimeSum.primesum(4));
    }
}