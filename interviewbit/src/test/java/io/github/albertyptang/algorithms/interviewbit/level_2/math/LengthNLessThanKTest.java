package io.github.albertyptang.algorithms.interviewbit.level_2.math;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class LengthNLessThanKTest {
    @Test
    public void solve() throws Exception {
        assertEquals(2, LengthNLessThanK.solve(new ArrayList<>(Arrays.asList(0, 1, 5)), 1, 2));
        assertEquals(0, LengthNLessThanK.solve(new ArrayList<>(Arrays.asList(0, 1, 2, 5)), 2, 8));
        assertEquals(5, LengthNLessThanK.solve(new ArrayList<>(Arrays.asList(0, 1, 2, 5)), 2, 21));
    }

}