package io.github.albertyptang.algorithms.interviewbit.binary_search;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class SquareRootTest {
    @Test
    public void sqrt() throws Exception {
        assertEquals(0, SquareRoot.sqrt(0));
        assertEquals(1, SquareRoot.sqrt(1));
        assertEquals(4, SquareRoot.sqrt(16));
        assertEquals(3, SquareRoot.sqrt(11));
        assertEquals(46340, SquareRoot.sqrt(Integer.MAX_VALUE));
        assertEquals(30506, SquareRoot.sqrt(930675566));
    }

}