package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class MinSumPathInMatrixTest {
    @Test
    public void minPathSum() throws Exception {
        final ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>(Arrays.asList(1, 3, 2)));
        a.add(new ArrayList<>(Arrays.asList(4, 3, 1)));
        a.add(new ArrayList<>(Arrays.asList(5, 6, 1)));
        assertEquals(8, MinSumPathInMatrix.minPathSum(a));

        final ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        b.add(new ArrayList<>(Arrays.asList(20, 29, 84, 4, 32, 60, 86, 8, 7, 37)));
        b.add(new ArrayList<>(Arrays.asList(77, 69, 85, 83, 81, 78, 22, 45, 43, 63)));
        b.add(new ArrayList<>(Arrays.asList(60, 21, 0, 94, 59, 88, 9, 54, 30, 80)));
        b.add(new ArrayList<>(Arrays.asList(40, 78, 52, 58, 26, 84, 47, 0, 24, 60)));
        b.add(new ArrayList<>(Arrays.asList(40, 17, 69, 5, 38, 5, 75, 59, 35, 26)));
        b.add(new ArrayList<>(Arrays.asList(64, 41, 85, 22, 44, 25, 3, 63, 33, 13)));
        b.add(new ArrayList<>(Arrays.asList(2, 21, 39, 51, 75, 70, 76, 57, 56, 22)));
        b.add(new ArrayList<>(Arrays.asList(31, 45, 47, 100, 65, 10, 94, 96, 81, 14)));
        assertEquals(470, MinSumPathInMatrix.minPathSum(b));
    }

}