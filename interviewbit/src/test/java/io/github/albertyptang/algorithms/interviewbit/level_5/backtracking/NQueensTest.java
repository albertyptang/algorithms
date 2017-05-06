package io.github.albertyptang.algorithms.interviewbit.level_5.backtracking;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class NQueensTest {
    @Test
    public void solveNQueens() throws Exception {
        assertEquals(2, NQueens.solveNQueens(4).size());
    }
}