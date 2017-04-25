package io.github.albertyptang.algorithms.interviewbit.binary_search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class RotatedArrayTest {
    @Test
    public void findMin() throws Exception {
        assertEquals(1, RotatedArray.findMin(new ArrayList<>(Arrays.asList(7, 8, 9, 10, 1, 2))));
        assertEquals(2, RotatedArray.findMin(new ArrayList<>(Arrays.asList(2, 3, 4))));
        assertEquals(3, RotatedArray.findMin(new ArrayList<>(Collections.singletonList(3))));
    }

}