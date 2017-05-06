package io.github.albertyptang.algorithms.interviewbit.backtracking;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class GrayCodeTest {
    @Test
    public void grayCode() throws Exception {
        final ArrayList<Integer> twoGrayCode = GrayCode.grayCode(2);
        assertArrayEquals(new Integer[] {0, 1, 3, 2}, twoGrayCode.toArray(new Integer[twoGrayCode.size()]));

        final ArrayList<Integer> threeGrayCode = GrayCode.grayCode(3);
        assertArrayEquals(new Integer[] {0, 1, 3, 2, 6, 7, 5, 4}, threeGrayCode.toArray(new Integer[threeGrayCode.size()]));
    }

}