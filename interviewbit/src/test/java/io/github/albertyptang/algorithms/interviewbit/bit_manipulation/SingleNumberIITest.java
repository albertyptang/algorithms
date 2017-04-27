package io.github.albertyptang.algorithms.interviewbit.bit_manipulation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class SingleNumberIITest {
    @Test
    public void singleNumber() throws Exception {
        assertEquals(2, SingleNumberII.singleNumber(new ArrayList<>(Arrays.asList(1,2,1,1))));
    }
}