package io.github.albertyptang.algorithms.interviewbit.bit_manipulation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class MinXorValueTest {
    @Test
    public void findMinXor() throws Exception {
        assertEquals(2, MinXorValue.findMinXor(new ArrayList<>(Arrays.asList(0, 2, 5, 7))));
        assertEquals(3, MinXorValue.findMinXor(new ArrayList<>(Arrays.asList(0, 4, 7, 9))));
    }
}