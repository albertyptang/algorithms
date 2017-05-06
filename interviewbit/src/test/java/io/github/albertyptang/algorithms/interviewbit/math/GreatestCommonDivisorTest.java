package io.github.albertyptang.algorithms.interviewbit.math;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class GreatestCommonDivisorTest {
    @Test
    public void gcd() throws Exception {
        assertEquals(3, GreatestCommonDivisor.gcd(3, 9));
        assertEquals(2, GreatestCommonDivisor.gcd(4, 6));
        assertEquals(2, GreatestCommonDivisor.gcd(156, 350));
    }

}