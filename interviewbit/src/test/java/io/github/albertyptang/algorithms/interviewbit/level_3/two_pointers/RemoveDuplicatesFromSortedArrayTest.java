package io.github.albertyptang.algorithms.interviewbit.level_3.two_pointers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void removeDuplicates() throws Exception {
        final ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 2));
        assertEquals(2, RemoveDuplicatesFromSortedArray.removeDuplicates(a));
        assertEquals(2, a.size());

        final ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 1, 1));
        assertEquals(1, RemoveDuplicatesFromSortedArray.removeDuplicates(b));
        assertEquals(1, b.size());

        final ArrayList<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(3, RemoveDuplicatesFromSortedArray.removeDuplicates(c));
        assertEquals(3, c.size());
    }

}