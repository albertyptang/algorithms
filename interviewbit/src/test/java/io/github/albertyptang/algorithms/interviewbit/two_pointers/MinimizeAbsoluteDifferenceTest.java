package io.github.albertyptang.algorithms.interviewbit.two_pointers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class MinimizeAbsoluteDifferenceTest {
    @Test
    public void solve() throws Exception {
        assertEquals(1, MinimizeAbsoluteDifference.solve(
            new ArrayList<>(Arrays.asList(1, 4, 5, 8, 10)),
            new ArrayList<>(Arrays.asList(6, 9, 15)),
            new ArrayList<>(Arrays.asList(2, 3, 6, 6))
        ));
    }
}