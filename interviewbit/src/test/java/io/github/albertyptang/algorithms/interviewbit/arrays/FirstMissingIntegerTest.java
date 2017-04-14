package io.github.albertyptang.algorithms.interviewbit.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class FirstMissingIntegerTest {
    @Test
    public void firstMissingPositive() throws Exception {
        assertEquals("", 1, FirstMissingInteger.firstMissingPositive(new ArrayList<>()));
        assertEquals("1, 2, 0", 3, FirstMissingInteger.firstMissingPositive(new ArrayList<>(Arrays.asList(1, 2, 0))));
        assertEquals("3, 4, -1, 1", 2, FirstMissingInteger.firstMissingPositive(new ArrayList<>(Arrays.asList(3, 4, -1, 1))));
        assertEquals("-8, -7, -6", 1, FirstMissingInteger.firstMissingPositive(new ArrayList<>(Arrays.asList(-8, -7, -6))));
        assertEquals("8, -3, 0, -1, -2, 1, 3, 4, 2", 5, FirstMissingInteger.firstMissingPositive(new ArrayList<>(Arrays.asList(8, -3, 0, -1, -2, 1, 3, 4, 2))));
    }
}