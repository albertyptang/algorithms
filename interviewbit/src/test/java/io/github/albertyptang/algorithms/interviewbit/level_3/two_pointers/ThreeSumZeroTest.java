package io.github.albertyptang.algorithms.interviewbit.level_3.two_pointers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class ThreeSumZeroTest {
    @Test
    public void threeSum() throws Exception {

        final ArrayList<Integer> a = new ArrayList<>(Arrays.asList(-1, 0, 1, 2, -1, -4));
        assertEquals(2, ThreeSumZero.threeSum(a).size());

        final ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3));
        assertEquals(12, ThreeSumZero.threeSum(b).size());
    }
}