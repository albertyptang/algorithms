package io.github.albertyptang.algorithms.interviewbit.backtracking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class CombinationSumTest {
    @Test
    public void combinationSum() throws Exception {
        assertEquals(2, CombinationSum.combinationSum(new ArrayList<>(Arrays.asList(2, 3, 6, 7)), 7).size());
        assertEquals(5, CombinationSum.combinationSum(new ArrayList<>(Arrays.asList(3, 2, 1)), 5).size());
        assertEquals(39, CombinationSum.combinationSum(new ArrayList<>(Arrays.asList(8, 10, 6, 11, 1, 16, 8)), 28).size());
    }

}