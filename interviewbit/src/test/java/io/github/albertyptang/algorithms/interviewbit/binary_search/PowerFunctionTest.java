package io.github.albertyptang.algorithms.interviewbit.binary_search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class PowerFunctionTest {
    @Test
    public void pow() throws Exception {
        assertEquals(1, PowerFunction.pow(3, 200, 50));
        assertEquals(1, PowerFunction.pow(-1, 2, 20));
        assertEquals(20805472, PowerFunction.pow(71045970, 41535484, 64735492));
    }
}