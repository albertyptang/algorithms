package io.github.albertyptang.algorithms.interviewbit.backtracking;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class NQueensTest {
    @Test
    public void solveNQueens() throws Exception {
        assertEquals(2, NQueens.solveNQueens(4).size());
    }

}