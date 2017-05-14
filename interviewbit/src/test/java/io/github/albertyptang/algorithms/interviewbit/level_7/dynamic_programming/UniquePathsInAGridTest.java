package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class UniquePathsInAGridTest {
    @Test
    public void uniquePathsWithObstacles() throws Exception {
        final ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        a.add(new ArrayList<>(Arrays.asList(0, 1, 0)));
        a.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        assertEquals(2, UniquePathsInAGrid.uniquePathsWithObstacles(a));

        final ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        b.add(new ArrayList<>(Arrays.asList(1, 0)));
        assertEquals(0, UniquePathsInAGrid.uniquePathsWithObstacles(b));

        final ArrayList<ArrayList<Integer>> c = new ArrayList<>();
        c.add(new ArrayList<>(Arrays.asList(0, 0)));
        c.add(new ArrayList<>(Arrays.asList(0, 0)));
        c.add(new ArrayList<>(Arrays.asList(0, 0)));
        c.add(new ArrayList<>(Arrays.asList(1, 0)));
        c.add(new ArrayList<>(Arrays.asList(0, 0)));
        assertEquals(3, UniquePathsInAGrid.uniquePathsWithObstacles(c));
    }

}