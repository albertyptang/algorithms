package io.github.albertyptang.algorithms.interviewbit.arrays.arragement;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class LargestNumberTest {
    @Test
    public void largestNumber() throws Exception {
        assertEquals("34330", LargestNumber.largestNumber(new ArrayList<>(Arrays.asList(3, 34, 30))));
        assertEquals("29829", LargestNumber.largestNumber(new ArrayList<>(Arrays.asList(298, 29))));
        assertEquals("1161", LargestNumber.largestNumber(new ArrayList<>(Arrays.asList(116, 1))));
        assertEquals("9534330", LargestNumber.largestNumber(new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9))));
    }
}