package io.github.albertyptang.algorithms.interviewbit.level_3.binary_search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class MatrixSearchTest {
    @Test
    public void searchMatrix() throws Exception {
        final ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>(Arrays.asList(1, 3, 5, 7)));
        a.add(new ArrayList<>(Arrays.asList(10, 11, 16, 20)));
        a.add(new ArrayList<>(Arrays.asList(23, 30, 34, 50)));
        a.add(new ArrayList<>(Arrays.asList(51, 52, 53, 54)));
        assertEquals(0, MatrixSearch.searchMatrix(a, 0));
        assertEquals(0, MatrixSearch.searchMatrix(a, 55));
        assertEquals(0, MatrixSearch.searchMatrix(a, 2));
        assertEquals(0, MatrixSearch.searchMatrix(a, 21));
        assertEquals(1, MatrixSearch.searchMatrix(a, 3));
        assertEquals(1, MatrixSearch.searchMatrix(a, 10));
        assertEquals(1, MatrixSearch.searchMatrix(a, 50));
        assertEquals(1, MatrixSearch.searchMatrix(a, 54));
    }
}