package io.github.albertyptang.algorithms.interviewbit.level_3.two_pointers;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class IntersectionOfSortedArraysTest {
    @Test
    public void intersect() throws Exception {
        final List<Integer> a = Arrays.asList(1, 3, 8, 10, 13, 13, 16, 16, 16, 18, 21, 23, 24, 31, 31, 31, 33, 35, 35, 37, 37, 38, 40, 41, 43, 47, 47, 48, 48, 52, 52, 53, 53, 55, 56, 60, 60, 61, 61, 63, 63, 64, 66, 67, 67, 68, 69, 71, 80, 80, 80, 80, 80, 80, 81, 85, 87, 87, 88, 89, 90, 94, 95, 97, 98, 98, 100, 101);
        final List<Integer> b = Arrays.asList(5, 7, 14, 14, 25, 28, 28, 34, 35, 38, 38, 39, 46, 53, 65, 67, 69, 70, 78, 82, 94, 94, 98);
        assertEquals(7, IntersectionOfSortedArrays.intersect(a, b).size());
    }
}