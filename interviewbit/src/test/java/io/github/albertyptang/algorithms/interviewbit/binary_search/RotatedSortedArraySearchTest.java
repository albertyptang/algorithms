package io.github.albertyptang.algorithms.interviewbit.binary_search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class RotatedSortedArraySearchTest {
    @Test
    public void search() throws Exception {
        final ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2));
        // entries that exist.
        assertEquals(5, RotatedSortedArraySearch.search(a, 1));
        assertEquals(0, RotatedSortedArraySearch.search(a, 4));
        assertEquals(4, RotatedSortedArraySearch.search(a, 0));
        assertEquals(3, RotatedSortedArraySearch.search(a, 7));
        assertEquals(6, RotatedSortedArraySearch.search(a, 2));
        // entries that don't exist.
        assertEquals(-1, RotatedSortedArraySearch.search(a, 3));
        assertEquals(-1, RotatedSortedArraySearch.search(a, 20));
        assertEquals(-1, RotatedSortedArraySearch.search(a, -5));

        // non-rotated
        final ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 7, 67, 133, 178));
        assertEquals(0, RotatedSortedArraySearch.search(b, 1));
    }
}