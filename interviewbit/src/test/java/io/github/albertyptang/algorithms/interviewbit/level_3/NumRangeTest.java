package io.github.albertyptang.algorithms.interviewbit.level_3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class NumRangeTest {
    @Test
    public void numRange() throws Exception {
        assertEquals(3, NumRange.numRange(new ArrayList<>(Arrays.asList(10, 5, 1, 0, 2)), 6, 8));
        assertEquals(0, NumRange.numRange(new ArrayList<>(Collections.singletonList(1)), 0, 0));
        assertEquals(58, NumRange.numRange(new ArrayList<>(Arrays.asList(80, 97, 78, 45, 23, 38, 38, 93, 83, 16, 91, 69, 18, 82, 60, 50, 61, 70, 15, 6, 52, 90)),
            99, 269)
        );
    }

}