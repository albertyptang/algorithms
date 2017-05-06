package io.github.albertyptang.algorithms.interviewbit.level_3.binary_search;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class CountElementOccurrenceTest {
    @Test
    public void testFindCount() throws Exception {
        final List<Integer> list = Arrays.asList(5, 7, 7, 8, 8, 10);
        assertEquals(2, CountElementOccurrence.findCount(list, 8));
        assertEquals(2, CountElementOccurrence.findCount(list, 7));
        assertEquals(1, CountElementOccurrence.findCount(list, 5));
        assertEquals(1, CountElementOccurrence.findCount(list, 10));
        assertEquals(0, CountElementOccurrence.findCount(list, 11));
    }
}