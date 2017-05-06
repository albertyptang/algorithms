package io.github.albertyptang.algorithms.interviewbit.bit_manipulation;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class SingleNumberTest {
    @Test
    public void singleNumber() throws Exception {
        assertEquals(2, SingleNumber.singleNumber(Arrays.asList(1, 2, 1)));
        assertEquals(2, SingleNumber.singleNumber(Collections.singletonList(2)));
    }
}