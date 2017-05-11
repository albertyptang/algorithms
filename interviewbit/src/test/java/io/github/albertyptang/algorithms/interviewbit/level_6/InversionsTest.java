package io.github.albertyptang.algorithms.interviewbit.level_6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class InversionsTest {
    @Test
    public void countInversions() throws Exception {
        assertEquals(3, Inversions.countInversions(new ArrayList<>(Arrays.asList(2, 4, 1, 3, 5))));
        assertEquals(5, Inversions.countInversions(new ArrayList<>(Arrays.asList(2, 4, 1, 3, 5, 3))));
        assertEquals(10, Inversions.countInversions(new ArrayList<>(Arrays.asList(2, 4, 1, 3, 5, 3, 1))));
        assertEquals(290, Inversions.countInversions(new ArrayList<>(Arrays.asList(
            84, 2, 37, 3, 67, 82, 19, 97, 91, 63, 27, 6, 13, 90, 63, 89, 100, 60, 47, 96, 54, 26, 64, 50, 71, 16, 6, 40, 84, 93, 67, 85, 16, 22, 60
        ))));
    }

}