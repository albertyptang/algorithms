package io.github.albertyptang.algorithms.interviewbit.binary_search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class CountElementOccurrenceTest {
    @Test
    public void testFindCount() throws Exception {
        assertEquals(2, CountElementOccurrence.findCount(new ArrayList<>(Arrays.asList(5,7,7,8,8,10)), 8));
        assertEquals(2, CountElementOccurrence.findCount(new ArrayList<>(Arrays.asList(5,7,7,8,8,10)), 7));
        assertEquals(1, CountElementOccurrence.findCount(new ArrayList<>(Arrays.asList(5,7,7,8,8,10)), 5));
        assertEquals(1, CountElementOccurrence.findCount(new ArrayList<>(Arrays.asList(5,7,7,8,8,10)), 10));
        assertEquals(0, CountElementOccurrence.findCount(new ArrayList<>(Arrays.asList(5,7,7,8,8,10)), 11));
    }
}