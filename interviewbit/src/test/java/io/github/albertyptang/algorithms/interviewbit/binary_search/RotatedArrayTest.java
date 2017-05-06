package io.github.albertyptang.algorithms.interviewbit.binary_search;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class RotatedArrayTest {
    @Test
    public void findMin() throws Exception {
        assertEquals(1, RotatedArray.findMin(Arrays.asList(7, 8, 9, 10, 1, 2)));
        assertEquals(2, RotatedArray.findMin(Arrays.asList(2, 3, 4)));
        assertEquals(3, RotatedArray.findMin(Collections.singletonList(3)));
    }

}