package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class MinSumPathInATriangleTest {
    @Test
    public void minimumTotal() throws Exception {
        final ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>(Arrays.asList(2)));
        a.add(new ArrayList<>(Arrays.asList(3, 4)));
        a.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        a.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));
        assertEquals(11, MinSumPathInATriangle.minimumTotal(a));
    }

}