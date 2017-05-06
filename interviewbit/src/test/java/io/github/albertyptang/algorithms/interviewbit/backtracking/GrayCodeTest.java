package io.github.albertyptang.algorithms.interviewbit.backtracking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class GrayCodeTest {
    @Test
    public void grayCode() throws Exception {
        final ArrayList<Integer> twoGrayCode = GrayCode.grayCode(2);
        assertEquals(new ArrayList<>(Arrays.asList(0, 1, 3, 2)), twoGrayCode);

        final ArrayList<Integer> threeGrayCode = GrayCode.grayCode(3);
        assertEquals(new ArrayList<>(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4)), threeGrayCode);
    }

}